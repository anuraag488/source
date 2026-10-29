package p000;

import java.lang.invoke.VarHandle;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import org.chromium.net.impl.CronetUrlRequestContext;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jt5 implements URLStreamHandlerFactory {

    /* JADX INFO: renamed from: a */
    public CronetUrlRequestContext f22613a;

    @Override // java.net.URLStreamHandlerFactory
    public final URLStreamHandler createURLStreamHandler(String str) {
        if (!"http".equals(str) && !"https".equals(str)) {
            return null;
        }
        CronetUrlRequestContext cronetUrlRequestContext = this.f22613a;
        at5 at5Var = new at5();
        at5Var.f14864a = cronetUrlRequestContext;
        VarHandle.storeStoreFence();
        return at5Var;
    }
}
