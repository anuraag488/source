package p000;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ce3 extends vr1 {
    private static final ce3 DEFAULT_INSTANCE;
    private static volatile m83 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private yp2 preferences_ = yp2.f35445b;

    static {
        ce3 ce3Var = new ce3();
        DEFAULT_INSTANCE = ce3Var;
        vr1.m11978j(ce3.class, ce3Var);
    }

    /* JADX INFO: renamed from: o */
    public static ae3 m3987o() {
        return (ae3) ((qr1) DEFAULT_INSTANCE.mo3989b(5));
    }

    /* JADX INFO: renamed from: p */
    public static ce3 m3988p(FileInputStream fileInputStream) {
        ce3 ce3Var = DEFAULT_INSTANCE;
        va0 va0Var = new va0();
        va0Var.f32493k = Integer.MAX_VALUE;
        byte[] bArr = l62.f23817a;
        va0Var.f32486d = fileInputStream;
        va0Var.f32487e = new byte[4096];
        va0Var.f32488f = 0;
        va0Var.f32490h = 0;
        va0Var.f32492j = 0;
        VarHandle.storeStoreFence();
        rc1 rc1VarM10284a = rc1.m10284a();
        vr1 vr1VarM11982i = ce3Var.m11982i();
        try {
            rh3 rh3Var = rh3.f29290c;
            rh3Var.getClass();
            gw3 gw3VarM10338a = rh3Var.m10338a(vr1VarM11982i.getClass());
            gw3VarM10338a.mo6184f(vr1VarM11982i, xa0.m12561b(va0Var), rc1VarM10284a);
            gw3VarM10338a.mo6180b(vr1VarM11982i);
            if (vr1.m11976e(vr1VarM11982i, true)) {
                return (ce3) vr1VarM11982i;
            }
            throw new i72(new fu4().getMessage());
        } catch (fu4 e) {
            throw new i72(e.getMessage());
        } catch (i72 e2) {
            if (e2.f21153a) {
                throw new i72(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof i72) {
                throw ((i72) e3.getCause());
            }
            throw new i72(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof i72) {
                throw ((i72) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // p000.vr1
    /* JADX INFO: renamed from: b */
    public final Object mo3989b(int i) {
        m83 sr1Var;
        int iM4376u = d55.m4376u(i);
        if (iM4376u == 0) {
            return (byte) 1;
        }
        if (iM4376u == 2) {
            return vr1.m11977h(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", be3.f15224a});
        }
        if (iM4376u == 3) {
            return new ce3();
        }
        if (iM4376u == 4) {
            return new ae3(DEFAULT_INSTANCE);
        }
        if (iM4376u == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iM4376u != 6) {
            throw null;
        }
        m83 m83Var = PARSER;
        if (m83Var != null) {
            return m83Var;
        }
        synchronized (ce3.class) {
            try {
                sr1Var = PARSER;
                if (sr1Var == null) {
                    sr1Var = new sr1(DEFAULT_INSTANCE);
                    PARSER = sr1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sr1Var;
    }

    /* JADX INFO: renamed from: m */
    public final Map m3990m() {
        return Collections.unmodifiableMap(this.preferences_);
    }

    /* JADX INFO: renamed from: n */
    public final yp2 m3991n() {
        yp2 yp2Var = this.preferences_;
        if (yp2Var.f35446a) {
            return yp2Var;
        }
        yp2 yp2VarM13210b = yp2Var.m13210b();
        this.preferences_ = yp2VarM13210b;
        return yp2VarM13210b;
    }
}
