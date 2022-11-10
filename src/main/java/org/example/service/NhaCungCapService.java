package org.example.service;

//import com.example.fashionshop.model.NhaCungCap;
//import javafx.collections.ObservableList;

import org.example.model.NhaCungCap;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface NhaCungCapService extends Remote {

    public List<NhaCungCap> getAllNhaCungCap()throws RemoteException;;

    public boolean addNhaCungCap(NhaCungCap nhaCungCap)throws RemoteException;;

    public boolean updateNhaCungCap(NhaCungCap nhaCungCap)throws RemoteException;;

    public boolean deleteNhaCungCap(NhaCungCap nhaCungCap)throws RemoteException;;

}
