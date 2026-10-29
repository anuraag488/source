package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class r82 extends hb3 {

    /* JADX INFO: renamed from: c */
    public Method f29084c;

    /* JADX INFO: renamed from: d */
    public Method f29085d;

    /* JADX INFO: renamed from: e */
    public Method f29086e;

    /* JADX INFO: renamed from: f */
    public Class f29087f;

    /* JADX INFO: renamed from: g */
    public Class f29088g;

    @Override // p000.hb3
    /* JADX INFO: renamed from: a */
    public final void mo6327a(SSLSocket sSLSocket) {
        try {
            this.f29086e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            xy4.m12790s("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            xy4.m12790s("failed to remove ALPN", e2);
        }
    }

    @Override // p000.hb3
    /* JADX INFO: renamed from: c */
    public final void mo4282c(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((wh3) obj) != wh3.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ib0.m6717y0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((wh3) obj2).f33392a);
        }
        try {
            ClassLoader classLoader = hb3.class.getClassLoader();
            Class[] clsArr = {this.f29087f, this.f29088g};
            q82 q82Var = new q82();
            q82Var.f28281a = arrayList2;
            VarHandle.storeStoreFence();
            this.f29084c.invoke(null, sSLSocket, Proxy.newProxyInstance(classLoader, clsArr, q82Var));
        } catch (IllegalAccessException e) {
            xy4.m12790s("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            xy4.m12790s("failed to set ALPN", e2);
        }
    }

    @Override // p000.hb3
    /* JADX INFO: renamed from: d */
    public final String mo4283d(SSLSocket sSLSocket) {
        try {
            q82 q82Var = (q82) Proxy.getInvocationHandler(this.f29085d.invoke(null, sSLSocket));
            boolean z = q82Var.f28282b;
            if (!z && q82Var.f28283c == null) {
                hb3.m6326f(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z) {
                return null;
            }
            return q82Var.f28283c;
        } catch (IllegalAccessException e) {
            xy4.m12790s("failed to get ALPN selected protocol", e);
            return null;
        } catch (InvocationTargetException e2) {
            xy4.m12790s("failed to get ALPN selected protocol", e2);
            return null;
        }
    }
}
