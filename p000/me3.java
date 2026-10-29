package p000;

import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class me3 implements Iterable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24838a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f24839b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f24840c;

    public /* synthetic */ me3(byte b) {
        this.f24838a = b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f24838a) {
            case 0:
                Iterator it = ((List) this.f24839b).iterator();
                Iterator it2 = ((List) this.f24840c).iterator();
                ne3 ne3Var = new ne3((byte) 0);
                ne3Var.f25734b = it;
                ne3Var.f25735c = it2;
                VarHandle.storeStoreFence();
                return ne3Var;
            default:
                wd3 wd3Var = (wd3) this.f24840c;
                return ((bb4) wd3Var.f33259b).mo3538f(wd3Var, (CharSequence) this.f24839b);
        }
    }

    public String toString() {
        switch (this.f24838a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                try {
                    ab4 ab4Var = (ab4) iterator();
                    if (ab4Var.hasNext()) {
                        Object next = ab4Var.next();
                        Objects.requireNonNull(next);
                        sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                        while (ab4Var.hasNext()) {
                            sb.append((CharSequence) ", ");
                            Object next2 = ab4Var.next();
                            Objects.requireNonNull(next2);
                            sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                            break;
                        }
                    }
                    sb.append(']');
                    return sb.toString();
                } catch (IOException e) {
                    C1077qn.m9985k(e);
                    return null;
                }
            default:
                return super.toString();
        }
    }
}
