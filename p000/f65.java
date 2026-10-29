package p000;

import android.widget.LinearLayout;
import com.google.android.libraries.ads.mobile.sdk.common.AdActivity;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class f65 implements ab5 {
    @Override // p000.ab5
    /* JADX INFO: renamed from: a */
    public final void mo179a(AdActivity adActivity) {
        LinearLayout linearLayout = new LinearLayout(adActivity);
        adActivity.setContentView(linearLayout);
        mo945a(adActivity, linearLayout);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo945a(AdActivity adActivity, LinearLayout linearLayout);
}
