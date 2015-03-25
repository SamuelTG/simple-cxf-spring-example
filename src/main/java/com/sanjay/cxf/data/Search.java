package com.sanjay.cxf.data;

public class Search {

    private long idSearch;

    private String nameSearch;

    public Search() {
        this.idSearch = -1;
        this.nameSearch = "";
    }

    public long getIdSearch() {
        return idSearch;
    }

    public void setIdSearch(long idSearch) {
        this.idSearch = idSearch;
    }

    public String getNameSearch() {
        return nameSearch;
    }

    public void setNameSearch(String nameSearch) {
        this.nameSearch = nameSearch;
    }

}
