package rest.dto.task;

public class MyTask {

    public int main_report_form = 12;
    public int location = 1;
    public int type =2;
    public String description = "zxc";
    public String planned_start_at_date = "2020-09-26";
    public String planned_start_at_time = "12:00";
    public String planned_end_at = "2020-05-08T14:30";
    public String assigned_user = "qeqweqweqweqee";


        public MyTask () {

        }

    public MyTask(int main_report_form, int location, int type, String description, String planned_start_at_date, String planned_start_at_time, String planned_end_at, String assigned_user) {


        this.main_report_form = main_report_form;
        this.location = location;
        this.type = type;
        this.description = description;
        this.planned_start_at_date = planned_start_at_date;
        this.planned_start_at_time = planned_start_at_time;
        this.planned_end_at = planned_end_at;
        this.assigned_user = assigned_user;
    }
}
