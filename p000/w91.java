package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w91 implements jc2 {

    /* JADX INFO: renamed from: a */
    public Enum[] f33168a;

    /* JADX INFO: renamed from: b */
    public dg4 f33169b;

    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        Enum[] enumArr = this.f33168a;
        int iMo5379C = iv0Var.mo5379C(mo15d());
        if (iMo5379C >= 0 && iMo5379C < enumArr.length) {
            return enumArr[iMo5379C];
        }
        throw new o24(iMo5379C + " is not among valid " + mo15d().mo3641b() + " enum values, values size is " + enumArr.length);
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        Enum r5 = (Enum) obj;
        Enum[] enumArr = this.f33168a;
        int iM9210e0 = AbstractC0990oo.m9210e0(r5, enumArr);
        if (iM9210e0 != -1) {
            g81Var.mo5917C(mo15d(), iM9210e0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String strMo3641b = mo15d().mo3641b();
        String string = Arrays.toString(enumArr);
        sb.append(" is not a valid enum ");
        sb.append(strMo3641b);
        sb.append(", must be one of ");
        sb.append(string);
        throw new o24(sb.toString());
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return (g24) this.f33169b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + mo15d().mo3641b() + '>';
    }
}
