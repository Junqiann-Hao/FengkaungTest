package com.example.myapplication;

import java.util.List;

/**
 * Created by 16359 on 2016/8/24.
 * 使用插件解析json测试
 */

public class Bean {


    /**
     * status : 0
     * msg :
     * result : {"lsprefix":"苏","lsnum":"B1585W","carorg":"jiangsu","usercarid":"4086362","list":[{"time":"2016-04-27 15:41:00","address":"梁溪路鸿桥路口","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009011648251","illegalid":"4162438","score":"3"},{"time":"2016-04-25 16:45:00","address":"县前西街春申路口","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009011627642","illegalid":"4162439","score":"3"},{"time":"2016-04-14 12:41:00","address":"红星路稻香路口","content":"驾驶机动车违反道路交通信号灯通行","legalnum":"16252","price":"200","number":"3202009011548833","illegalid":"4162440","score":"6"},{"time":"2016-02-27 00:33:00","address":"江海路惠勤路口","content":"通过有灯控路口时，不按所需行进方向驶入导向车道","legalnum":"1208","price":"100","number":"3202009011082974","illegalid":"4162441","score":"2"},{"time":"2016-02-05 12:01:00","address":"友谊路春鑫路口","content":"驾驶机动车违反道路交通信号灯通行","legalnum":"16252","price":"200","number":"3202009010915810","illegalid":"4162442","score":"6"},{"time":"2016-01-23 00:20:00","address":"凤翔高架k8.2由南向北","content":"驾驶中型以上载客载货汽车、危险物品运输车辆以外的其他机动车行驶超过规定时速10%未达20%","legalnum":"13523","price":"50","number":"3202009010804265","illegalid":"4162443","score":"3"},{"time":"2015-12-17 15:14:00","address":"文华路","content":"违反规定停放，妨碍其他车辆、行人通行的，驾驶人不在现场","legalnum":"10393","price":"50","number":"3202039000524605","illegalid":"4162444","score":"0"},{"time":"2015-12-01 22:19:00","address":"运河东路金城桥南匝道","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009010400768","illegalid":"4162445","score":"3"},{"time":"2015-10-27 14:29:00","address":"永乐东路塘南路","content":"驾驶机动车违反道路交通信号灯通行","legalnum":"16252","price":"200","number":"3202009010168689","illegalid":"4162446","score":"6"},{"time":"2015-08-27 15:00:00","address":"金城隧道由北向东","content":"驾驶中型以上载客载货汽车、校车、危险物品运输车辆以外的其他机动车行驶超过规定时速20%以上未达到50%","legalnum":"1636","price":"200","number":"3202009009677694","illegalid":"4162447","score":"6"},{"time":"2015-07-03 11:43:00","address":"青山西路大池路口","content":"驾驶机动车违反道路交通信号灯通行","legalnum":"16252","price":"200","number":"3202009009099730","illegalid":"4162448","score":"6"},{"time":"2015-06-28 19:08:00","address":"江海高架锡澄路段由西向东","content":"驾驶中型以上载客载货汽车、校车、危险物品运输车辆以外的其他机动车行驶超过规定时速20%以上未达到50%","legalnum":"1636","price":"200","number":"3202009009046490","illegalid":"4162449","score":"6"},{"time":"2015-06-13 17:56:00","address":"梁溪路青山西路口","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009008974878","illegalid":"4162450","score":"3"},{"time":"2015-06-12 11:40:00","address":"大池路鸿桥路口","content":"驾驶机动车违反道路交通信号灯通行","legalnum":"16252","price":"200","number":"3202009008956949","illegalid":"4162451","score":"6"},{"time":"2015-06-07 11:00:00","address":"万千巷","content":"违反规定停放，妨碍其他车辆、行人通行的，驾驶人不在现场","legalnum":"10393","price":"50","number":"3202119000441096","illegalid":"4162452","score":"0"},{"time":"2015-05-27 01:02:00","address":"凤宾路民丰路口","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009008828127","illegalid":"4162453","score":"3"},{"time":"2015-05-17 20:58:00","address":"钱威路钱桥新街路口","content":"驾驶机动车违反道路交通信号灯通行","legalnum":"16252","price":"200","number":"3202009008754060","illegalid":"4162454","score":"6"},{"time":"2015-05-13 12:26:00","address":"万千巷","content":"违反规定停放，妨碍其他车辆、行人通行的，驾驶人不在现场","legalnum":"10393","price":"50","number":"3202119000432201","illegalid":"4162455","score":"0"},{"time":"2015-05-03 01:15:00","address":"运河东路金城桥南匝道","content":"通过有灯控路口时，不按所需行进方向驶入导向车道","legalnum":"1208","price":"100","number":"3202009008648682","illegalid":"4162456","score":"2"},{"time":"2015-04-17 14:49:00","address":"梁清路湖滨路口","content":"通过有灯控路口时，不按所需行进方向驶入导向车道","legalnum":"1208","price":"100","number":"3202009008498861","illegalid":"4162457","score":"2"},{"time":"2015-03-23 10:50:00","address":"永丰路南长街路口","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009008245782","illegalid":"4162458","score":"3"},{"time":"2015-03-15 01:46:00","address":"江海高架锡澄路段由西向东","content":"驾驶中型以上载客载货汽车、危险物品运输车辆以外的其他机动车行驶超过规定时速10%未达20%","legalnum":"13523","price":"50","number":"3202009008245781","illegalid":"4162459","score":"3"},{"time":"2015-02-28 13:19:00","address":"友谊路二泉路口","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009008062570","illegalid":"4162460","score":"3"},{"time":"2015-02-12 16:35:00","address":"梁溪路青山西路口","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009007929316","illegalid":"4162461","score":"3"},{"time":"2015-02-07 15:42:00","address":"S342省道钱洛路口","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009007900897","illegalid":"4162462","score":"3"},{"time":"2014-12-09 15:33:00","address":"湖滨路","content":"违反规定停放，妨碍其他车辆、行人通行的，驾驶人不在现场","legalnum":"10393","price":"50","number":"3202307900134292","illegalid":"4162463","score":"0"},{"time":"2014-10-27 11:16:00","address":"兴昌路缇香路路口","content":"通过有灯控路口时，不按所需行进方向驶入导向车道","legalnum":"1208","price":"100","number":"3202129001098810","illegalid":"4162464","score":"2"},{"time":"2014-06-18 19:11:00","address":"民丰路","content":"违反规定停放，妨碍其他车辆、行人通行的，驾驶人不在现场","legalnum":"10393","price":"50","number":"3202049000300666","illegalid":"4162465","score":"0"},{"time":"2014-04-18 13:10:00","address":"学前街健康路口","content":"通过有灯控路口时，不按所需行进方向驶入导向车道","legalnum":"1208","price":"100","number":"3202009005760462","illegalid":"4162466","score":"2"},{"time":"2014-04-17 13:57:00","address":"太湖大道湖滨路口","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009005780974","illegalid":"4162467","score":"3"},{"time":"2014-03-17 17:26:00","address":"兴昌路叙康路路口","content":"通过有灯控路口时，不按所需行进方向驶入导向车道","legalnum":"1208","price":"100","number":"3202129000919504","illegalid":"4162468","score":"2"},{"time":"2014-03-05 10:25:00","address":"东亭路芙蓉五路口","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009005431411","illegalid":"4162469","score":"3"}]}
     */

    private String status;
    private String msg;
    /**
     * lsprefix : 苏
     * lsnum : B1585W
     * carorg : jiangsu
     * usercarid : 4086362
     * list : [{"time":"2016-04-27 15:41:00","address":"梁溪路鸿桥路口","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009011648251","illegalid":"4162438","score":"3"},{"time":"2016-04-25 16:45:00","address":"县前西街春申路口","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009011627642","illegalid":"4162439","score":"3"},{"time":"2016-04-14 12:41:00","address":"红星路稻香路口","content":"驾驶机动车违反道路交通信号灯通行","legalnum":"16252","price":"200","number":"3202009011548833","illegalid":"4162440","score":"6"},{"time":"2016-02-27 00:33:00","address":"江海路惠勤路口","content":"通过有灯控路口时，不按所需行进方向驶入导向车道","legalnum":"1208","price":"100","number":"3202009011082974","illegalid":"4162441","score":"2"},{"time":"2016-02-05 12:01:00","address":"友谊路春鑫路口","content":"驾驶机动车违反道路交通信号灯通行","legalnum":"16252","price":"200","number":"3202009010915810","illegalid":"4162442","score":"6"},{"time":"2016-01-23 00:20:00","address":"凤翔高架k8.2由南向北","content":"驾驶中型以上载客载货汽车、危险物品运输车辆以外的其他机动车行驶超过规定时速10%未达20%","legalnum":"13523","price":"50","number":"3202009010804265","illegalid":"4162443","score":"3"},{"time":"2015-12-17 15:14:00","address":"文华路","content":"违反规定停放，妨碍其他车辆、行人通行的，驾驶人不在现场","legalnum":"10393","price":"50","number":"3202039000524605","illegalid":"4162444","score":"0"},{"time":"2015-12-01 22:19:00","address":"运河东路金城桥南匝道","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009010400768","illegalid":"4162445","score":"3"},{"time":"2015-10-27 14:29:00","address":"永乐东路塘南路","content":"驾驶机动车违反道路交通信号灯通行","legalnum":"16252","price":"200","number":"3202009010168689","illegalid":"4162446","score":"6"},{"time":"2015-08-27 15:00:00","address":"金城隧道由北向东","content":"驾驶中型以上载客载货汽车、校车、危险物品运输车辆以外的其他机动车行驶超过规定时速20%以上未达到50%","legalnum":"1636","price":"200","number":"3202009009677694","illegalid":"4162447","score":"6"},{"time":"2015-07-03 11:43:00","address":"青山西路大池路口","content":"驾驶机动车违反道路交通信号灯通行","legalnum":"16252","price":"200","number":"3202009009099730","illegalid":"4162448","score":"6"},{"time":"2015-06-28 19:08:00","address":"江海高架锡澄路段由西向东","content":"驾驶中型以上载客载货汽车、校车、危险物品运输车辆以外的其他机动车行驶超过规定时速20%以上未达到50%","legalnum":"1636","price":"200","number":"3202009009046490","illegalid":"4162449","score":"6"},{"time":"2015-06-13 17:56:00","address":"梁溪路青山西路口","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009008974878","illegalid":"4162450","score":"3"},{"time":"2015-06-12 11:40:00","address":"大池路鸿桥路口","content":"驾驶机动车违反道路交通信号灯通行","legalnum":"16252","price":"200","number":"3202009008956949","illegalid":"4162451","score":"6"},{"time":"2015-06-07 11:00:00","address":"万千巷","content":"违反规定停放，妨碍其他车辆、行人通行的，驾驶人不在现场","legalnum":"10393","price":"50","number":"3202119000441096","illegalid":"4162452","score":"0"},{"time":"2015-05-27 01:02:00","address":"凤宾路民丰路口","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009008828127","illegalid":"4162453","score":"3"},{"time":"2015-05-17 20:58:00","address":"钱威路钱桥新街路口","content":"驾驶机动车违反道路交通信号灯通行","legalnum":"16252","price":"200","number":"3202009008754060","illegalid":"4162454","score":"6"},{"time":"2015-05-13 12:26:00","address":"万千巷","content":"违反规定停放，妨碍其他车辆、行人通行的，驾驶人不在现场","legalnum":"10393","price":"50","number":"3202119000432201","illegalid":"4162455","score":"0"},{"time":"2015-05-03 01:15:00","address":"运河东路金城桥南匝道","content":"通过有灯控路口时，不按所需行进方向驶入导向车道","legalnum":"1208","price":"100","number":"3202009008648682","illegalid":"4162456","score":"2"},{"time":"2015-04-17 14:49:00","address":"梁清路湖滨路口","content":"通过有灯控路口时，不按所需行进方向驶入导向车道","legalnum":"1208","price":"100","number":"3202009008498861","illegalid":"4162457","score":"2"},{"time":"2015-03-23 10:50:00","address":"永丰路南长街路口","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009008245782","illegalid":"4162458","score":"3"},{"time":"2015-03-15 01:46:00","address":"江海高架锡澄路段由西向东","content":"驾驶中型以上载客载货汽车、危险物品运输车辆以外的其他机动车行驶超过规定时速10%未达20%","legalnum":"13523","price":"50","number":"3202009008245781","illegalid":"4162459","score":"3"},{"time":"2015-02-28 13:19:00","address":"友谊路二泉路口","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009008062570","illegalid":"4162460","score":"3"},{"time":"2015-02-12 16:35:00","address":"梁溪路青山西路口","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009007929316","illegalid":"4162461","score":"3"},{"time":"2015-02-07 15:42:00","address":"S342省道钱洛路口","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009007900897","illegalid":"4162462","score":"3"},{"time":"2014-12-09 15:33:00","address":"湖滨路","content":"违反规定停放，妨碍其他车辆、行人通行的，驾驶人不在现场","legalnum":"10393","price":"50","number":"3202307900134292","illegalid":"4162463","score":"0"},{"time":"2014-10-27 11:16:00","address":"兴昌路缇香路路口","content":"通过有灯控路口时，不按所需行进方向驶入导向车道","legalnum":"1208","price":"100","number":"3202129001098810","illegalid":"4162464","score":"2"},{"time":"2014-06-18 19:11:00","address":"民丰路","content":"违反规定停放，妨碍其他车辆、行人通行的，驾驶人不在现场","legalnum":"10393","price":"50","number":"3202049000300666","illegalid":"4162465","score":"0"},{"time":"2014-04-18 13:10:00","address":"学前街健康路口","content":"通过有灯控路口时，不按所需行进方向驶入导向车道","legalnum":"1208","price":"100","number":"3202009005760462","illegalid":"4162466","score":"2"},{"time":"2014-04-17 13:57:00","address":"太湖大道湖滨路口","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009005780974","illegalid":"4162467","score":"3"},{"time":"2014-03-17 17:26:00","address":"兴昌路叙康路路口","content":"通过有灯控路口时，不按所需行进方向驶入导向车道","legalnum":"1208","price":"100","number":"3202129000919504","illegalid":"4162468","score":"2"},{"time":"2014-03-05 10:25:00","address":"东亭路芙蓉五路口","content":"违反禁止标线指示","legalnum":"13451","price":"100","number":"3202009005431411","illegalid":"4162469","score":"3"}]
     */

    private ResultBean result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private String lsprefix;
        private String lsnum;
        private String carorg;
        private String usercarid;
        /**
         * time : 2016-04-27 15:41:00
         * address : 梁溪路鸿桥路口
         * content : 违反禁止标线指示
         * legalnum : 13451
         * price : 100
         * number : 3202009011648251
         * illegalid : 4162438
         * score : 3
         */

        private List<ListBean> list;

        public String getLsprefix() {
            return lsprefix;
        }

        public void setLsprefix(String lsprefix) {
            this.lsprefix = lsprefix;
        }

        public String getLsnum() {
            return lsnum;
        }

        public void setLsnum(String lsnum) {
            this.lsnum = lsnum;
        }

        public String getCarorg() {
            return carorg;
        }

        public void setCarorg(String carorg) {
            this.carorg = carorg;
        }

        public String getUsercarid() {
            return usercarid;
        }

        public void setUsercarid(String usercarid) {
            this.usercarid = usercarid;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private String time;
            private String address;
            private String content;
            private String legalnum;
            private String price;
            private String number;
            private String illegalid;
            private String score;

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getLegalnum() {
                return legalnum;
            }

            public void setLegalnum(String legalnum) {
                this.legalnum = legalnum;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getNumber() {
                return number;
            }

            public void setNumber(String number) {
                this.number = number;
            }

            public String getIllegalid() {
                return illegalid;
            }

            public void setIllegalid(String illegalid) {
                this.illegalid = illegalid;
            }

            public String getScore() {
                return score;
            }

            public void setScore(String score) {
                this.score = score;
            }
        }
    }
}
