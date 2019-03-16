package com.yyc.yycframework.entity;

public class ViewControllers {
    private Integer id;

    private String viewController;

    private String viewName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getViewController() {
        return viewController;
    }

    public void setViewController(String viewController) {
        this.viewController = viewController == null ? null : viewController.trim();
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName == null ? null : viewName.trim();
    }
}