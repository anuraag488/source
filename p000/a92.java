package p000;

import java.util.ArrayList;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a92 implements c22 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ long f181b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ long f182c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ long f183d;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: a */
    public final g13 f184a;

    static {
        Unsafe unsafe = AbstractC1078qo.f28633a;
        f182c = unsafe.objectFieldOffset(a92.class.getDeclaredField("_isCompleting$volatile"));
        f183d = unsafe.objectFieldOffset(a92.class.getDeclaredField("_rootCause$volatile"));
        f181b = unsafe.objectFieldOffset(a92.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public a92(g13 g13Var, Throwable th) {
        this.f184a = g13Var;
        this._rootCause$volatile = th;
    }

    /* JADX INFO: renamed from: a */
    public final void m145a(Throwable th) {
        Throwable thM147c = m147c();
        if (thM147c == null) {
            AbstractC1078qo.f28633a.putObjectVolatile(this, f183d, th);
            return;
        }
        if (th == thM147c) {
            return;
        }
        Unsafe unsafe = AbstractC1078qo.f28633a;
        long j = f181b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            unsafe.putObjectVolatile(this, j, th);
            return;
        }
        if (!(objectVolatile instanceof Throwable)) {
            if (objectVolatile instanceof ArrayList) {
                ((ArrayList) objectVolatile).add(th);
                return;
            } else {
                nm0.m8798k(objectVolatile, "State is ");
                return;
            }
        }
        if (th == objectVolatile) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objectVolatile);
        arrayList.add(th);
        unsafe.putObjectVolatile(this, j, arrayList);
    }

    @Override // p000.c22
    /* JADX INFO: renamed from: b */
    public final boolean mo146b() {
        return m147c() == null;
    }

    /* JADX INFO: renamed from: c */
    public final Throwable m147c() {
        return (Throwable) AbstractC1078qo.f28633a.getObjectVolatile(this, f183d);
    }

    @Override // p000.c22
    /* JADX INFO: renamed from: d */
    public final g13 mo148d() {
        return this.f184a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m149e() {
        return m147c() != null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m150f() {
        return AbstractC1078qo.f28633a.getIntVolatile(this, f182c) == 1;
    }

    /* JADX INFO: renamed from: g */
    public final ArrayList m151g(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = AbstractC1078qo.f28633a;
        long j = f181b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else {
            if (!(objectVolatile instanceof ArrayList)) {
                nm0.m8798k(objectVolatile, "State is ");
                return null;
            }
            arrayList = (ArrayList) objectVolatile;
        }
        Throwable thM147c = m147c();
        if (thM147c != null) {
            arrayList.add(0, thM147c);
        }
        if (th != null && !th.equals(thM147c)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j, f92.f18859e);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + m149e() + ", completing=" + m150f() + ", rootCause=" + m147c() + ", exceptions=" + AbstractC1078qo.f28633a.getObjectVolatile(this, f181b) + ", list=" + this.f184a + ']';
    }
}
