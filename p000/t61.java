package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t61 extends View {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ s61 f30796a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t61(s61 s61Var, Context context) {
        super(context);
        this.f30796a = s61Var;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        this.f30796a.run();
    }
}
