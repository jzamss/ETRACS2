package etracs2.groovy;

import com.rameses.rcp.common.*;
import com.rameses.rcp.annotations.*;
import com.rameses.osiris2.client.*;

abstract class CRUDController {
    @Binding
    def binding;
    
    def selectedItem;
    def list;
    def mode = "view" ;
    def entity;
    def searchText;
    
    abstract def getService();
    def getCreateFocusComponent() { return "entity.objid"; }
    def getEditFocusComponent() { return "entity.objid"; }
    abstract def getListHandler();
    def createEntity() { return [:]; }
    
    void init() {
        entity = createEntity();
        list = getList( searchText, null );
    }
    
    void create() {
        entity = createEntity();
        mode = "create";
        focus( createFocusComponent );
    }
    
    void edit() {
        mode = "edit";
        focus( editFocusComponent );
    }
    
    void cancel() {
        open( selectedItem?.objid );
        mode = "view";
        binding.refresh("entity.*");
        listHandler.load();
    }
    
    void save() {
        if( mode == "create") {
            entity = service.create( entity );
            insertItem( entity );
        } else {
            entity = service.update( entity );
            updateItem( entity );
        }
        mode = "view";
        binding.focus( "selectedItem" );
    }
    
    void delete() {
        if( MsgBox.confirm("Delete record?") ) {
            service.delete( entity );
            list.remove( entity );
            mode = "view";
        }
    }
    
    void approve(){
        if( MsgBox.confirm( "Are you sure you want to approve?" ) ){
            selectedItem.putAll( svc.approve( selectedItem?.objid ) );
            mode = "view";
        }
        listHandler.refresh();
    }
    
    void focus( name ) {
        binding.refresh("entity.*");
        binding.focus( name );
    }
    
    void setSelectedItem( item ) {
        selectedItem = item;
        if( mode !=  "create" ) {
            entity = selectedItem
                    if( ! entity ) {
                entity = createEntity();
                    }else{
                entity = selectedItem;
                    }
        } else {
            open( entity.objid )
        }
    }
    
    void search() {
        list = getList( searchText, null );
        listHandler.load();
    }
    
    def getList( searchValue, params ) {
        return svc.getList( searchValue, params );
    }
    
    void open( objid ) {
        entity = service.open( objid );
        if( ! entity) {
            entity = createEntity();
        }
    }
    
    void insertItem( item ) {
        if( selectedItem ) {
            def entity = findEntityFromList( selectedItem );
            if( entity )
                list.add( list.indexOf( entity ), item );
            else
                list.add( item );
        } else {
            list.add( item );
        }
    }
    void updateItem( item ) {
        def entity = findEntityFromList( item );
        if( entity ) {
            list.set( list.indexOf(entity), item );
        }
    }
    
    def findEntityFromList( item ) {
        return list.find{ a -> a.objid == item.objid };
    }
}