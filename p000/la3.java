package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class la3 extends AbstractC1352y1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23891a;

    /* JADX INFO: renamed from: b */
    public final ja3 f23892b;

    public /* synthetic */ la3(ja3 ja3Var, byte b) {
        this.f23891a = b;
        this.f23892b = ja3Var;
    }

    @Override // p000.AbstractC1352y1
    /* JADX INFO: renamed from: a */
    public final int mo7889a() {
        byte b = this.f23891a;
        ja3 ja3Var = this.f23892b;
        switch (b) {
            case 0:
                break;
        }
        return ja3Var.f22138f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f23891a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.f23891a;
        ja3 ja3Var = this.f23892b;
        switch (b) {
            case 0:
                ja3Var.clear();
                break;
            default:
                ja3Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f23891a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if ((entry instanceof Object ? entry : null) instanceof Map.Entry) {
                        Object key = entry.getKey();
                        ja3 ja3Var = this.f23892b;
                        Object obj2 = ja3Var.get(key);
                        if (obj2 != null) {
                            return obj2.equals(entry.getValue());
                        }
                        if (entry.getValue() == null && ja3Var.containsKey(entry.getKey())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f23892b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.f23891a;
        ja3 ja3Var = this.f23892b;
        int i = 0;
        switch (b) {
            case 0:
                ma3 ma3Var = new ma3((byte) 0);
                aq4[] aq4VarArr = new aq4[8];
                while (i < 8) {
                    cq4 cq4Var = new cq4();
                    cq4Var.f16376d = ma3Var;
                    VarHandle.storeStoreFence();
                    aq4VarArr[i] = cq4Var;
                    i++;
                }
                ma3Var.f24786b = new ka3(ja3Var, aq4VarArr);
                VarHandle.storeStoreFence();
                return ma3Var;
            default:
                aq4[] aq4VarArr2 = new aq4[8];
                while (i < 8) {
                    aq4VarArr2[i] = new bq4((byte) 1);
                    i++;
                }
                return new na3(ja3Var, aq4VarArr2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f23891a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry instanceof Object ? entry : null) instanceof Map.Entry) {
                    return this.f23892b.remove(entry.getKey(), entry.getValue());
                }
                return false;
            default:
                ja3 ja3Var = this.f23892b;
                if (!ja3Var.containsKey(obj)) {
                    return false;
                }
                ja3Var.remove(obj);
                return true;
        }
    }
}
