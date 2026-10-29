package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oa3 extends AbstractC1019p2 implements y12 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f26499a;

    /* JADX INFO: renamed from: b */
    public ha3 f26500b;

    public /* synthetic */ oa3(byte b) {
        this.f26499a = b;
    }

    @Override // p000.AbstractC0929n0
    /* JADX INFO: renamed from: a */
    public final int mo103a() {
        switch (this.f26499a) {
            case 0:
                break;
        }
        return this.f26500b.f20461b;
    }

    @Override // p000.AbstractC0929n0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f26499a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    ha3 ha3Var = this.f26500b;
                    if (entry instanceof Map.Entry) {
                        Object obj2 = ha3Var.get(entry.getKey());
                        if (obj2 != null) {
                            return obj2.equals(entry.getValue());
                        }
                        if (entry.getValue() == null && ha3Var.containsKey(entry.getKey())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f26500b.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f26499a) {
            case 0:
                zp4 zp4Var = this.f26500b.f20460a;
                aq4[] aq4VarArr = new aq4[8];
                for (int i = 0; i < 8; i++) {
                    aq4VarArr[i] = new bq4((byte) 0);
                }
                return new pa3(zp4Var, aq4VarArr);
            default:
                zp4 zp4Var2 = this.f26500b.f20460a;
                aq4[] aq4VarArr2 = new aq4[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    aq4VarArr2[i2] = new bq4((byte) 1);
                }
                return new pa3(zp4Var2, aq4VarArr2);
        }
    }
}
