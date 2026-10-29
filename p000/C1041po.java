package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;

/* JADX INFO: renamed from: po */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1041po implements Iterable, cc2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27849a;

    /* JADX INFO: renamed from: b */
    public Object f27850b;

    public C1041po(wp1 wp1Var) {
        this.f27849a = (byte) 1;
        this.f27850b = wp1Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f27849a) {
            case 0:
                return y70.m13010K((Object[]) this.f27850b);
            case 1:
                Iterator it = (Iterator) ((wp1) this.f27850b).invoke();
                f41 f41Var = new f41((byte) 1);
                f41Var.f18743b = it;
                VarHandle.storeStoreFence();
                return f41Var;
            case 2:
                return ((iy0) this.f27850b).iterator();
            default:
                t91 t91Var = (t91) this.f27850b;
                C1018p1 c1018p1 = new C1018p1((byte) 2);
                c1018p1.f27270c = t91Var;
                c1018p1.f27269b = t91Var.f16972c;
                VarHandle.storeStoreFence();
                return c1018p1;
        }
    }

    public /* synthetic */ C1041po(byte b) {
        this.f27849a = b;
    }
}
