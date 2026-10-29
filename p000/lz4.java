package p000;

import java.lang.invoke.VarHandle;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class lz4 {

    /* JADX INFO: renamed from: a */
    public static final w42 f24486a;

    static {
        WebkitToCompatConverterBoundaryInterface webkitToCompatConverter = mz4.f25346a.getWebkitToCompatConverter();
        w42 w42Var = new w42((byte) 24, false);
        w42Var.f33090b = webkitToCompatConverter;
        VarHandle.storeStoreFence();
        f24486a = w42Var;
    }
}
