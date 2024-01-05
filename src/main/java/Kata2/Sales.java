package Kata2;

public class Sales {
    private String Region;
    private String Country;
    private String Item_Type;
    private String Sales_Channel;
    private String Order_Priority;
    private String Order_Date;
    private String Order_ID;
    private String Ship_Date;
    private String Units_Sold;
    private String Unit_Price;
    private String Unit_Cost;
    private String Total_Revenue;
    private String Total_Cost;
    private String Total_Profit;

    public Sales(String region, String country, String item_Type, String sales_Channel, String order_Priority, String order_Date, String order_ID, String ship_Date, String units_Sold, String unit_Price, String unit_Cost, String total_Revenue, String total_Cost, String total_Profit) {
        Region = region;
        Country = country;
        Item_Type = item_Type;
        Sales_Channel = sales_Channel;
        Order_Priority = order_Priority;
        Order_Date = order_Date;
        Order_ID = order_ID;
        Ship_Date = ship_Date;
        Units_Sold = units_Sold;
        Unit_Price = unit_Price;
        Unit_Cost = unit_Cost;
        Total_Revenue = total_Revenue;
        Total_Cost = total_Cost;
        Total_Profit = total_Profit;
    }

    public String getRegion() {
        return Region;
    }

    public String getCountry() {
        return Country;
    }

    public String getItem_Type() {
        return Item_Type;
    }

    public String getSales_Channel() {
        return Sales_Channel;
    }

    public String getOrder_Priority() {
        return Order_Priority;
    }

    public String getOrder_Date() {
        return Order_Date;
    }

    public String getOrder_ID() {
        return Order_ID;
    }

    public String getShip_Date() {
        return Ship_Date;
    }

    public String getUnits_Sold() {
        return Units_Sold;
    }

    public String getUnit_Price() {
        return Unit_Price;
    }

    public String getUnit_Cost() {
        return Unit_Cost;
    }

    public String getTotal_Revenue() {
        return Total_Revenue;
    }

    public String getTotal_Cost() {
        return Total_Cost;
    }

    public String getTotal_Profit() {
        return Total_Profit;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "Region='" + Region + '\'' +
                ", Country='" + Country + '\'' +
                ", Item_Type='" + Item_Type + '\'' +
                ", Sales_Channel='" + Sales_Channel + '\'' +
                ", Order_Priority='" + Order_Priority + '\'' +
                ", Order_Date='" + Order_Date + '\'' +
                ", Order_ID='" + Order_ID + '\'' +
                ", Ship_Date='" + Ship_Date + '\'' +
                ", Units_Sold='" + Units_Sold + '\'' +
                ", Unit_Price='" + Unit_Price + '\'' +
                ", Unit_Cost='" + Unit_Cost + '\'' +
                ", Total_Revenue='" + Total_Revenue + '\'' +
                ", Total_Cost='" + Total_Cost + '\'' +
                ", Total_Profit='" + Total_Profit + '\'' +
                '}';
    }
}
