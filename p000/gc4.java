package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gc4 extends AbstractC0856l1 implements Iterator, cc2 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ byte f19739g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gc4(y94 y94Var, Iterator it, byte b) {
        super(y94Var, it);
        this.f19739g = b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f19739g) {
            case 0:
                m7797a();
                Map.Entry entry = (Map.Entry) this.f23689e;
                if (entry == null) {
                    xy4.m12787p();
                    return null;
                }
                fc4 fc4Var = new fc4();
                fc4Var.f18909c = this;
                fc4Var.f18907a = entry.getKey();
                fc4Var.f18908b = ((Map.Entry) this.f23689e).getValue();
                VarHandle.storeStoreFence();
                return fc4Var;
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f23690f;
                if (entry2 != null) {
                    m7797a();
                    return entry2.getKey();
                }
                xy4.m12787p();
                return null;
            default:
                Map.Entry entry3 = (Map.Entry) this.f23690f;
                if (entry3 != null) {
                    m7797a();
                    return entry3.getValue();
                }
                xy4.m12787p();
                return null;
        }
    }
}
