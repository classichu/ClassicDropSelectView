package com.classichu.classicdropselectview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.classichu.dropselectview.bean.ClassfiyBean;
import com.classichu.dropselectview.widget.ClassicSelectView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ClassicSelectView classicSelectView= (ClassicSelectView) findViewById(R.id.id_classic_select_view);
        List<ClassfiyBean> cblist=new ArrayList<>();
         for (int i = 0; i < 6; i++) {
            ClassfiyBean classfiyBean=new ClassfiyBean();
            classfiyBean.setBeanID(i+"");
            classfiyBean.setID(i);
            classfiyBean.setName("test"+i);
             cblist.add(classfiyBean);
        }
      //### classicSelectView.setupClassfiyBeanList(cblist);
    }
}
