package com.panky.foodies.View.Category;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.panky.foodies.Adapter.ViewPagerCategoryAdapter;
import com.panky.foodies.Constant.constantValues;
import com.panky.foodies.Model.Categories;
import com.panky.foodies.R;

import java.util.List;

public class CategoryActivity extends AppCompatActivity implements constantValues {

    private Toolbar tbCategory;
    private TabLayout tblCategory;
    private ViewPager viewPagerCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        initViews();
        initActionBar();

        Intent intent = getIntent();
        List<Categories.Category> categories = (List<Categories.Category>) intent.getSerializableExtra(EXTRA_CATEGORY);
        int position = intent.getIntExtra(EXTRA_POSITION, 0);



        ViewPagerCategoryAdapter pagerCategoryAdapter = new ViewPagerCategoryAdapter(getSupportFragmentManager(), categories);
        viewPagerCategory.setAdapter(pagerCategoryAdapter);
        tblCategory.setupWithViewPager(viewPagerCategory);
        viewPagerCategory.setCurrentItem(position, true);
        pagerCategoryAdapter.notifyDataSetChanged();
    }

    private void initViews(){
        tbCategory = findViewById(R.id.tbCategory);
        tblCategory = findViewById(R.id.tblCategory);
        viewPagerCategory = findViewById(R.id.viewPagerCategory);

    }
    private void initActionBar() {
        setSupportActionBar(tbCategory);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

}
