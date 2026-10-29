package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class mz4 {

    /* JADX INFO: renamed from: a */
    public static final pz4 f25346a;

    static {
        pz4 ig1Var;
        try {
            WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface = (WebViewProviderFactoryBoundaryInterface) i20.m6592q(WebViewProviderFactoryBoundaryInterface.class, y62.m12996z());
            wd3 wd3Var = new wd3((byte) 21);
            wd3Var.f33259b = webViewProviderFactoryBoundaryInterface;
            VarHandle.storeStoreFence();
            ig1Var = wd3Var;
        } catch (ClassNotFoundException unused) {
            ig1Var = new ig1((byte) 7);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        f25346a = ig1Var;
    }
}
