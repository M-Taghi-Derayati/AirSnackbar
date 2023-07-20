package com.mtd.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mtd.insnackbar.AirySnackbar
import com.mtd.insnackbar.AirySnackbarSource
import com.mtd.insnackbar.AnimationAttribute
import com.mtd.insnackbar.GravityAttribute
import com.mtd.insnackbar.R
import com.mtd.insnackbar.RadiusAttribute
import com.mtd.insnackbar.SizeAttribute
import com.mtd.insnackbar.SizeUnit
import com.mtd.insnackbar.TextAttribute
import com.mtd.insnackbar.Type

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_airy_snackbar)


        AirySnackbar.make(
            source = AirySnackbarSource.ActivitySource(activity = this),
            type = Type.Error,
            attributes =
            listOf(
                TextAttribute.Text(text = "sdaflkasdfj"),
                SizeAttribute.Margin(left = 24, right = 24, unit = SizeUnit.DP),
                SizeAttribute.Padding(top = 12, bottom = 12,left=12,right=12, unit = SizeUnit.DP),
                RadiusAttribute.Radius(radius = 8f),
                GravityAttribute.Top,
                AnimationAttribute.FadeInOut
            )
        ).show()
    }
}