package p000;

import ads_mobile_sdk.C0213l2;
import ads_mobile_sdk.C0360um;
import ads_mobile_sdk.i51;
import ads_mobile_sdk.ql0;
import ads_mobile_sdk.s41;
import ads_mobile_sdk.ut3;
import ads_mobile_sdk.wt0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface kk5 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    static Object m7530a(kk5 kk5Var, i51 i51Var, C0213l2 c0213l2, ql0 ql0Var, ym0 ym0Var) {
        wt0 wt0Var;
        String string;
        if (ym0Var instanceof wt0) {
            wt0Var = (wt0) ym0Var;
            int i = wt0Var.f13079f;
            if ((i & Integer.MIN_VALUE) != 0) {
                wt0Var.f13079f = i - Integer.MIN_VALUE;
            } else {
                wt0Var = new wt0(kk5Var, ym0Var);
            }
        } else {
            wt0Var = new wt0(kk5Var, ym0Var);
        }
        Object obj = wt0Var.f13077d;
        ap0 ap0Var = ap0.f14763a;
        int i2 = wt0Var.f13079f;
        ju4 ju4Var = ju4.f22634a;
        if (i2 == 0) {
            k43.m7376J(obj);
            s41 s41Var = i51Var.f4806a;
            wt0Var.f13074a = i51Var;
            wt0Var.f13075b = c0213l2;
            wt0Var.f13076c = ql0Var;
            wt0Var.f13079f = 1;
            wa2 wa2Var = new wa2();
            wa2Var.m12183w("app_muted", String.valueOf(kk5Var.mo1428a().f12421d));
            wa2Var.m12183w("app_volume", String.valueOf(kk5Var.mo1428a().f12420c));
            Object objM2210a = s41Var.m2210a(wa2Var, "volume", wt0Var);
            if (objM2210a != ap0Var) {
                objM2210a = ju4Var;
            }
            if (objM2210a == ap0Var) {
                return ap0Var;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ql0Var = wt0Var.f13076c;
            c0213l2 = wt0Var.f13075b;
            i51Var = wt0Var.f13074a;
            k43.m7376J(obj);
        }
        i51Var.f4807b = ql0Var;
        if (c0213l2.f6617d0) {
            Context context = i51Var.getContext();
            ut3 ut3Var = new ut3(context);
            try {
                string = context.getResources().getString(C0995R.string.test_ad);
            } catch (Resources.NotFoundException unused) {
                string = "Test Ad";
            }
            ut3Var.setText(string);
            ut3Var.setTextSize(15.0f);
            ut3Var.setTextColor(-1);
            ut3Var.setPadding(5, 0, 5, 0);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(-12303292);
            gradientDrawable.setCornerRadius(8.0f);
            ut3Var.setBackground(gradientDrawable);
            i51Var.addView(ut3Var, new FrameLayout.LayoutParams(-2, -2, 49));
            i51Var.bringChildToFront(ut3Var);
        }
        return ju4Var;
    }

    /* JADX INFO: renamed from: a */
    C0360um mo1428a();
}
