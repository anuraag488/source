package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nb0 implements a24 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25615a;

    /* JADX INFO: renamed from: b */
    public Object f25616b;

    public /* synthetic */ nb0(byte b) {
        this.f25615a = b;
    }

    @Override // p000.a24
    public final Iterator iterator() {
        switch (this.f25615a) {
            case 0:
                return ((Iterable) this.f25616b).iterator();
            case 1:
                xf1 xf1Var = new xf1((byte) 0);
                xf1Var.f34224d = ((Iterable) ((nb0) this.f25616b).f25616b).iterator();
                xf1Var.f34223c = -1;
                VarHandle.storeStoreFence();
                return xf1Var;
            case 2:
                return (Iterator) this.f25616b;
            default:
                CharSequence charSequence = (CharSequence) this.f25616b;
                gl2 gl2Var = new gl2();
                gl2Var.f19853a = charSequence;
                VarHandle.storeStoreFence();
                return gl2Var;
        }
    }
}
