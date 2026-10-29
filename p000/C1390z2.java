package p000;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: z2 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1390z2 extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public int f35705a;

    /* JADX INFO: renamed from: b */
    public C1242v3 f35706b;

    /* JADX INFO: renamed from: c */
    public int f35707c;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f35705a);
        C1242v3 c1242v3 = this.f35706b;
        c1242v3.f32353a.performAction(this.f35707c, bundle);
    }
}
