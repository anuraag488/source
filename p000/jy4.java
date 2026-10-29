package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class jy4 {

    /* JADX INFO: renamed from: a */
    public final ky4 f22749a;

    public jy4() {
        ky4 ky4Var = new ky4();
        ky4Var.f23622a = new q50((byte) 19);
        ky4Var.f23623b = new LinkedHashMap();
        ky4Var.f23624c = new LinkedHashSet();
        VarHandle.storeStoreFence();
        this.f22749a = ky4Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m7339a() {
        ky4 ky4Var = this.f22749a;
        if (ky4Var != null && !ky4Var.f23625d) {
            ky4Var.f23625d = true;
            synchronized (ky4Var.f23622a) {
                try {
                    Iterator it = ky4Var.f23623b.values().iterator();
                    while (it.hasNext()) {
                        ky4.m7751a((AutoCloseable) it.next());
                    }
                    Iterator it2 = ky4Var.f23624c.iterator();
                    while (it2.hasNext()) {
                        ky4.m7751a((AutoCloseable) it2.next());
                    }
                    ky4Var.f23624c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        mo5324b();
    }

    /* JADX INFO: renamed from: b */
    public void mo5324b() {
    }
}
