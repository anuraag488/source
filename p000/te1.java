package p000;

import android.webkit.MimeTypeMap;
import java.io.File;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class te1 implements oe1 {

    /* JADX INFO: renamed from: a */
    public File f31096a;

    @Override // p000.oe1
    /* JADX INFO: renamed from: a */
    public final Object mo3767a(wm0 wm0Var) {
        String str = p83.f27431b;
        File file = this.f31096a;
        p83 p83VarM6220A = h50.m6220A(file);
        zb2 zb2Var = jf1.f22209a;
        ue1 ue1Var = new ue1();
        ue1Var.f31802a = p83VarM6220A;
        ue1Var.f31803b = zb2Var;
        ue1Var.f31804c = null;
        ue1Var.f31805d = null;
        VarHandle.storeStoreFence();
        return new oa4(ue1Var, MimeTypeMap.getSingleton().getMimeTypeFromExtension(hd4.m6355u0('.', file.getName(), "")), kt0.f23415c);
    }
}
