package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: rg */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class C1107rg implements ca4 {

    /* JADX INFO: renamed from: f */
    public static final o85 f29229f;

    /* JADX INFO: renamed from: a */
    public Class f29230a;

    /* JADX INFO: renamed from: b */
    public Method f29231b;

    /* JADX INFO: renamed from: c */
    public Method f29232c;

    /* JADX INFO: renamed from: d */
    public Method f29233d;

    /* JADX INFO: renamed from: e */
    public Method f29234e;

    static {
        o85 o85Var = new o85((byte) 28);
        VarHandle.storeStoreFence();
        f29229f = o85Var;
    }

    @Override // p000.ca4
    /* JADX INFO: renamed from: a */
    public final boolean mo3933a(SSLSocket sSLSocket) {
        return this.f29230a.isInstance(sSLSocket);
    }

    @Override // p000.ca4
    /* JADX INFO: renamed from: b */
    public final String mo3934b(SSLSocket sSLSocket) {
        if (this.f29230a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f29233d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, z80.f35863a);
                }
            } catch (IllegalAccessException e) {
                C1077qn.m9985k(e);
                return null;
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !z62.m13387o(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    C1077qn.m9985k(e2);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // p000.ca4
    /* JADX INFO: renamed from: c */
    public final boolean mo3935c() {
        int i = AbstractC0610ef.f18039c;
        return false;
    }

    @Override // p000.ca4
    /* JADX INFO: renamed from: d */
    public final void mo3936d(SSLSocket sSLSocket, String str, List list) {
        if (this.f29230a.isInstance(sSLSocket)) {
            try {
                this.f29231b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f29232c.invoke(sSLSocket, str);
                }
                Method method = this.f29234e;
                hb3 hb3Var = hb3.f20468a;
                method.invoke(sSLSocket, sc6.m10681v(list));
            } catch (IllegalAccessException e) {
                C1077qn.m9985k(e);
            } catch (InvocationTargetException e2) {
                C1077qn.m9985k(e2);
            }
        }
    }
}
