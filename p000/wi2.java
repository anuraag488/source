package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wi2 implements bi3 {

    /* JADX INFO: renamed from: a */
    public volatile Set f33407a;

    /* JADX INFO: renamed from: b */
    public volatile Set f33408b;

    @Override // p000.bi3
    public final Object get() {
        if (this.f33408b == null) {
            synchronized (this) {
                try {
                    if (this.f33408b == null) {
                        this.f33408b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            try {
                                Iterator it = this.f33407a.iterator();
                                while (it.hasNext()) {
                                    this.f33408b.add(((bi3) it.next()).get());
                                }
                                this.f33407a = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.f33408b);
    }
}
