package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class xe6 {

    /* JADX INFO: renamed from: a */
    public static final C0805jo f34211a = new C0805jo(0);

    /* JADX INFO: renamed from: a */
    public static synchronized void m12682a() {
        C0805jo c0805jo = f34211a;
        Iterator it = ((C0769io) c0805jo.values()).iterator();
        if (it.hasNext()) {
            ((xe6) it.next()).getClass();
            throw null;
        }
        c0805jo.clear();
    }
}
