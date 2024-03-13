package com.example.task_recycler_view

object List_Data_Initialize {
    private lateinit var dataList: ArrayList<Data_Model_Class>  //Create variable of Data List
    fun getData():ArrayList<Data_Model_Class>
    {
        dataList=ArrayList()
        dataList.add(Data_Model_Class(R.drawable.a,"Turtle are slow"))
        dataList.add(Data_Model_Class(R.drawable.b,"Turtle are slow"))
        dataList.add(Data_Model_Class(R.drawable.c,"Turtle are slow"))
        dataList.add(Data_Model_Class(R.drawable.d,"Turtle are slow"))
        dataList.add(Data_Model_Class(R.drawable.e,"Turtle are slow"))
        dataList.add(Data_Model_Class(R.drawable.f,"Turtle are slow"))
        dataList.add(Data_Model_Class(R.drawable.a,"Turtle are slow"))
        dataList.add(Data_Model_Class(R.drawable.b,"Turtle are slow"))
        dataList.add(Data_Model_Class(R.drawable.c,"Turtle are slow"))

        return dataList
    }
}