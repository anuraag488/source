package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class iq2 extends AbstractC0929n0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21634a;

    /* JADX INFO: renamed from: b */
    public Object f21635b;

    public /* synthetic */ iq2(byte b) {
        this.f21634a = b;
    }

    @Override // p000.AbstractC0929n0
    /* JADX INFO: renamed from: a */
    public final int mo103a() {
        switch (this.f21634a) {
            case 0:
                return ((Matcher) ((C1283w7) this.f21635b).f33127c).groupCount() + 1;
            default:
                return ((ha3) this.f21635b).f20461b;
        }
    }

    /* JADX INFO: renamed from: b */
    public gq2 m6851b(int i) {
        Matcher matcher = (Matcher) ((C1283w7) this.f21635b).f33127c;
        r52 r52VarM10660c0 = sc6.m10660c0(matcher.start(i), matcher.end(i));
        if (r52VarM10660c0.f27382a < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        gq2 gq2Var = new gq2();
        gq2Var.f20026a = strGroup;
        gq2Var.f20027b = r52VarM10660c0;
        VarHandle.storeStoreFence();
        return gq2Var;
    }

    @Override // p000.AbstractC0929n0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f21634a) {
            case 0:
                if (obj == null ? true : obj instanceof gq2) {
                    return super.contains((gq2) obj);
                }
                return false;
            default:
                return ((ha3) this.f21635b).containsValue(obj);
        }
    }

    @Override // p000.AbstractC0929n0, java.util.Collection
    public boolean isEmpty() {
        switch (this.f21634a) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f21634a) {
            case 0:
                r52 r52Var = new r52(0, size() - 1, 1);
                nb0 nb0Var = new nb0((byte) 0);
                nb0Var.f25616b = r52Var;
                VarHandle.storeStoreFence();
                b71 b71Var = new b71((byte) 16);
                b71Var.f15141b = this;
                VarHandle.storeStoreFence();
                xr1 xr1Var = new xr1();
                xr1Var.f34562c = nb0Var;
                xr1Var.f34561b = b71Var;
                VarHandle.storeStoreFence();
                return xr1Var.iterator();
            default:
                zp4 zp4Var = ((ha3) this.f21635b).f20460a;
                aq4[] aq4VarArr = new aq4[8];
                for (int i = 0; i < 8; i++) {
                    aq4VarArr[i] = new bq4((byte) 2);
                }
                return new pa3(zp4Var, aq4VarArr);
        }
    }
}
