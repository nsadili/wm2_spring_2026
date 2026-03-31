package az.edu.ada.wm2.spring_boot_data_jpa_demo.model.dto;

import java.util.List;

//TODO
public class PagedResponse<T> {
    private List<T> content;
    private int total;
    private int pageCount;
    private int pageSize;
    private int pageNo;
}
