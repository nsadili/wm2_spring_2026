package az.edu.ada.wm2.spring_boot_data_jpa_demo.model.dto;

import java.util.List;

//TODO
public class PagedResponse<T> {

    private List<T> content;
    private int pageNo;
    private int pageSize;
    private int totalPages;
    private int total;
}
