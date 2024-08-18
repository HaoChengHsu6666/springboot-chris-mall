//package com.chrishsu.springbootchrismall.practice;
//
//import jdk.jfr.DataAmount;
//
//import java.util.List;
//
//public class Test {
//
//    List<CarSource> sources = new [3];
//    List <CarRecord> records = new [];
//
//    // 用Stream API 完成，Java 8以上的版本都可。
//    // 假設兩個資料陣列長度一定會一樣
//    // TODO 完成轉換
//
//        public static List<CarRecord> convertCarSources(List<CarSource> carSources) {
//            List<CarRecord> records = carSources.stream()
//                    .map(carSource -> {
//                        CarRecord carRecord = new CarRecord();
//                        carRecord.setVehicleKind(carSource.getVehicleKind());
//                        carRecord.setVehicleType(carSource.getVehicleType());
//                        carRecord.setSource(convertSourceDescriptionToCode(carSource.getSourceDescription()));
//                        return carRecord;
//                    })
//                    .collect(Collectors.toList());
//            return records;
//        }
//
//        private static String convertSourceDescriptionToCode(String sourceDescription) {
//            switch (sourceDescription) {
//                case "ABP":
//                    return "1";
//                case "NAP":
//                    return "2";
//                case "RES":
//                    return "3";
//                default:
//                    return "0";
//            }
//        }
//
//    /*
//    * 車籍資料來源
//    * */
//    @Data
//    @NoArgsConstructor
//    public static class CarSource {
//
//       private String vehicleKind;
//
//       private String vehicleType;
//
//       //國泰產險為ABP、自行新增為NAP、預約單為RES
//       private String sourceDescription;
//    }
//
//    /*
//    * 車籍資料
//    * */
//    @Data
//    @NoArgsConstructor
//    public static class CarRecord {
//
//        @Schema(title = "車種", example = "03")
//        private String vehicleKind;
//
//        @Schema(title = "車種類", example = "汽車")
//        private String vehicleType;
//
//        @Schema(title = "資料來源", example = "代碼0為未知來源、1為國泰產險、2為自行新增、3為預約單, example = "1")
//        private String source;
//
//    }
//}
