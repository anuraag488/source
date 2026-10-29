package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ld1 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23960a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ sw2 f23961b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ sw2 f23962c;

    public /* synthetic */ ld1(byte b) {
        this.f23960a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        String str;
        boolean z = false;
        i = 0;
        int i = 0;
        z = false;
        switch (this.f23960a) {
            case 0:
                sw2 sw2Var = this.f23961b;
                sw2 sw2Var2 = this.f23962c;
                if (((xp4) sw2Var.getValue()) == xp4.f34521b && ((Boolean) sw2Var2.getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                sw2 sw2Var3 = this.f23961b;
                sw2 sw2Var4 = this.f23962c;
                if (((Boolean) sw2Var3.getValue()).booleanValue()) {
                    return ((Boolean) sw2Var4.getValue()).booleanValue() ? sh1.f30271c : sh1.f30270b;
                }
                return sh1.f30269a;
            case 2:
                sw2 sw2Var5 = this.f23961b;
                sw2 sw2Var6 = this.f23962c;
                List list = (List) sw2Var5.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    rn2 rn2Var = (rn2) obj;
                    if (hd4.m6335a0(rn2Var.f29437c, ((xk4) sw2Var6.getValue()).f34341a.f24092b, true) || hd4.m6335a0(rn2Var.f29436b.name(), ((xk4) sw2Var6.getValue()).f34341a.f24092b, true) || hd4.m6335a0(rn2Var.f29438d, ((xk4) sw2Var6.getValue()).f34341a.f24092b, true) || ((str = rn2Var.f29439e) != null && hd4.m6335a0(str, ((xk4) sw2Var6.getValue()).f34341a.f24092b, true))) {
                        arrayList.add(obj);
                    }
                }
                return hb0.m6312X0(arrayList);
            default:
                sw2 sw2Var7 = this.f23961b;
                sw2 sw2Var8 = this.f23962c;
                if (sw2Var7.getValue() != null && sw2Var8.getValue() != null) {
                    long jMo4007b = ((cf2) sw2Var7.getValue()).mo4007b(0L);
                    long j = ((b33) sw2Var8.getValue()).f15059a;
                    i = Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (jMo4007b >> 32)) ? Float.intBitsToFloat((int) (j & 4294967295L)) < Float.intBitsToFloat((int) (jMo4007b & 4294967295L)) ? 1 : 3 : Float.intBitsToFloat((int) (j & 4294967295L)) < Float.intBitsToFloat((int) (jMo4007b & 4294967295L)) ? 2 : 4;
                }
                return Integer.valueOf(i);
        }
    }
}
