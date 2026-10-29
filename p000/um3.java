package p000;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class um3 implements InterfaceC0740hw {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f31992a = new AtomicReference();

    @Override // p000.InterfaceC0740hw
    /* JADX INFO: renamed from: a */
    public final void mo5703a(boolean z) {
        Random random = vm3.f32733j;
        synchronized (vm3.class) {
            Iterator it = vm3.f32734k.values().iterator();
            while (it.hasNext()) {
                ((wg1) it.next()).m12304c(z);
            }
        }
    }
}
