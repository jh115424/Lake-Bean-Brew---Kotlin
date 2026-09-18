package com.example.lakebeanbrew

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

/*Element	Simple definition
ConstraintLayout	A layout that positions views by attaching them to other views or to the edges of the screen.

NestedScrollView	A container that lets an entire screen of content scroll vertically, especially when it contains other complex layouts.

LinearLayout	A container that arranges its children in one direction: vertically or horizontally.

ImageView	Displays an image, such as your Chicago background or latte pictures.

TextView	Displays text such as headings, drink names, descriptions, and prices.

MaterialCardView	A Material Design container that groups content into a card. It can have rounded corners, borders, elevation/shadows, and backgrounds.

MaterialButton	A Material Design button that the user can tap to perform an action.

RadioGroup	Groups RadioButtons together so normally only one option can be selected at a time.

RadioButton	A selectable circular option used when the user must choose one item from a group, such as a drink size.

CheckBox	An option that can independently be checked or unchecked. Multiple CheckBoxes can be selected at the same time.

ChipGroup	A container that organizes multiple Chips together.

Chip	A small compact selectable item that can represent an option, filter, category, or choice.

MaterialDivider	A thin visual line used to separate sections of content.

Guideline	An invisible positioning line inside a ConstraintLayout. Other views can be constrained to it to keep alignment consistent.

Barrier	An invisible dynamic boundary in ConstraintLayout that positions itself based on the size/location of other views. Useful when those views can have different sizes.

Space	An invisible view used specifically to create empty space between other views.

Toolbar	The bar generally placed at the top of a screen that can contain the screen title, navigation arrow, menu items, or actions.

BottomNavigationView*/