package p000;

import android.view.View;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oj2 extends xq1 implements yp1 {

    /* JADX INFO: renamed from: b */
    public static final oj2 f26784b = new oj2(1, z32.class, "<init>", "<init>(Landroid/view/View;)V", 0);

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        z32 z32Var = new z32((byte) 0);
        z32Var.f35738b = view;
        aj2 aj2Var = aj2.f14537b;
        g32 g32Var = new g32((byte) 2);
        g32Var.f19558b = z32Var;
        VarHandle.storeStoreFence();
        z32Var.f35739c = i25.m6630z(aj2Var, g32Var);
        new w42(view);
        VarHandle.storeStoreFence();
        return z32Var;
    }
}
