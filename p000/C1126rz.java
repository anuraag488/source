package p000;

import android.content.SharedPreferences;
import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: rz */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1126rz {

    /* JADX INFO: renamed from: a */
    public boolean f29737a;

    /* JADX INFO: renamed from: b */
    public Object f29738b;

    /* JADX INFO: renamed from: c */
    public Object f29739c;

    /* JADX INFO: renamed from: d */
    public Object f29740d;

    public C1126rz(if1 if1Var, boolean z) {
        this.f29740d = if1Var;
        this.f29739c = new AtomicReference(null);
        this.f29737a = z;
        int i = z ? 8192 : 1024;
        sd2 sd2Var = new sd2();
        sd2Var.f30180a = new HashMap();
        sd2Var.f30181b = (byte) 64;
        sd2Var.f30182c = i;
        VarHandle.storeStoreFence();
        this.f29738b = new AtomicMarkableReference(sd2Var, false);
    }

    /* JADX INFO: renamed from: a */
    public void m10504a(boolean z) {
        d01 d01Var = (d01) this.f29740d;
        synchronized (d01Var) {
            try {
                if (this.f29737a) {
                    throw new IllegalStateException("editor is closed");
                }
                if (z62.m13387o(((a01) this.f29738b).f15g, this)) {
                    d01Var.m4246a(this, z);
                }
                this.f29737a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public p83 m10505b(int i) {
        p83 p83Var;
        d01 d01Var = (d01) this.f29740d;
        synchronized (d01Var) {
            if (this.f29737a) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f29739c)[i] = true;
            Object obj = ((a01) this.f29738b).f12d.get(i);
            c01 c01Var = d01Var.f16679p;
            p83 p83Var2 = (p83) obj;
            if (!c01Var.m7089j(p83Var2)) {
                AbstractC0707h.m6198a(c01Var.mo3780t(p83Var2));
            }
            p83Var = (p83) obj;
        }
        return p83Var;
    }

    /* JADX INFO: renamed from: c */
    public String m10506c() {
        if (!this.f29737a) {
            this.f29737a = true;
            s86 s86Var = (s86) this.f29740d;
            this.f29739c = s86Var.m10560y().getString((String) this.f29738b, null);
        }
        return (String) this.f29739c;
    }

    /* JADX INFO: renamed from: d */
    public void m10507d(String str) {
        SharedPreferences.Editor editorEdit = ((s86) this.f29740d).m10560y().edit();
        editorEdit.putString((String) this.f29738b, str);
        editorEdit.apply();
        this.f29739c = str;
    }

    public C1126rz(s86 s86Var, String str) {
        this.f29740d = s86Var;
        y42.m12851X(str);
        this.f29738b = str;
    }

    public C1126rz(d01 d01Var, a01 a01Var) {
        this.f29740d = d01Var;
        this.f29738b = a01Var;
        this.f29739c = new boolean[2];
    }
}
