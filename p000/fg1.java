package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fg1 implements InterfaceC0740hw {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f18957a = new AtomicReference();

    @Override // p000.InterfaceC0740hw
    /* JADX INFO: renamed from: a */
    public final void mo5703a(boolean z) {
        synchronized (hg1.f20543k) {
            try {
                ArrayList arrayList = new ArrayList(hg1.f20544l.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    hg1 hg1Var = (hg1) obj;
                    if (hg1Var.f20549e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = hg1Var.f20553i.iterator();
                        while (it.hasNext()) {
                            hg1 hg1Var2 = ((eg1) it.next()).f18067a;
                            if (!z) {
                                ((ew0) hg1Var2.f20552h.get()).m5409b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
