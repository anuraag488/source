package p000;

import android.net.Uri;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yy1 implements ne1 {

    /* JADX INFO: renamed from: a */
    public dg4 f35614a;

    /* JADX INFO: renamed from: b */
    public dg4 f35615b;

    @Override // p000.ne1
    /* JADX INFO: renamed from: a */
    public final oe1 mo5198a(Object obj, b63 b63Var) {
        Uri uri = (Uri) obj;
        if (!z62.m13387o(uri.getScheme(), "http") && !z62.m13387o(uri.getScheme(), "https")) {
            return null;
        }
        String string = uri.toString();
        dg4 dg4Var = this.f35614a;
        dg4 dg4Var2 = this.f35615b;
        bz1 bz1Var = new bz1();
        bz1Var.f15695a = string;
        bz1Var.f15696b = b63Var;
        bz1Var.f15697c = dg4Var;
        bz1Var.f15698d = dg4Var2;
        VarHandle.storeStoreFence();
        return bz1Var;
    }
}
