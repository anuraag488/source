package p000;

import java.lang.invoke.VarHandle;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: aa */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0011aa extends AbstractC0634f1 {

    /* JADX INFO: renamed from: j */
    public static final kx5 f198j;

    /* JADX INFO: renamed from: k */
    public static final Logger f199k = Logger.getLogger(AbstractC0011aa.class.getName());

    /* JADX INFO: renamed from: h */
    public volatile Set f200h;

    /* JADX INFO: renamed from: i */
    public volatile int f201i;

    static {
        kx5 c1397z9;
        try {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(AbstractC0011aa.class, Set.class, "h");
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdaterNewUpdater = AtomicIntegerFieldUpdater.newUpdater(AbstractC0011aa.class, "i");
            C1360y9 c1360y9 = new C1360y9();
            c1360y9.f35030o = atomicReferenceFieldUpdaterNewUpdater;
            c1360y9.f35031p = atomicIntegerFieldUpdaterNewUpdater;
            VarHandle.storeStoreFence();
            e = null;
            c1397z9 = c1360y9;
        } catch (Error | RuntimeException e) {
            e = e;
            c1397z9 = new C1397z9();
        }
        f198j = c1397z9;
        if (e != null) {
            f199k.log(Level.SEVERE, "SafeAtomicHelper is broken!", e);
        }
    }
}
