package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rd2 implements j41 {

    /* JADX INFO: renamed from: a */
    public qd2 f29184a;

    @Override // p000.InterfaceC1407zj
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final fx4 mo4410a(sq4 sq4Var) {
        int[] iArr;
        Object[] objArr;
        qd2 qd2Var = this.f29184a;
        lv2 lv2Var = qd2Var.f28398b;
        kv2 kv2Var = new kv2(lv2Var.f24669e + 2);
        lv2 lv2Var2 = new lv2(lv2Var.f24669e);
        int[] iArr2 = lv2Var.f24666b;
        Object[] objArr2 = lv2Var.f24667c;
        long[] jArr = lv2Var.f24665a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr2[i5];
                            pd2 pd2Var = (pd2) objArr2[i5];
                            kv2Var.m7633a(i6);
                            AbstractC0654fk abstractC0654fk = (AbstractC0654fk) sq4Var.f30508a.invoke(pd2Var.f27533a);
                            g51 g51Var = pd2Var.f27534b;
                            ex4 ex4Var = new ex4();
                            ex4Var.f18562a = abstractC0654fk;
                            ex4Var.f18563b = g51Var;
                            VarHandle.storeStoreFence();
                            lv2Var2.m8121h(i6, ex4Var);
                        }
                        j >>= i2;
                        i4++;
                        i2 = i2;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i3 != i2) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i == length) {
                    break;
                }
                i++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!lv2Var.m8196a(0)) {
            int i7 = kv2Var.f23538b;
            if (i7 < 0) {
                kx5.m7733s0("Index must be between 0 and size");
                throw null;
            }
            kv2Var.m7634b(i7 + 1);
            int[] iArr3 = kv2Var.f23537a;
            int i8 = kv2Var.f23538b;
            if (i8 != 0) {
                AbstractC0990oo.m9199T(iArr3, iArr3, 1, 0, i8);
            }
            iArr3[0] = 0;
            kv2Var.f23538b++;
        }
        if (!lv2Var.m8196a(qd2Var.f28397a)) {
            kv2Var.m7633a(qd2Var.f28397a);
        }
        int i9 = kv2Var.f23538b;
        if (i9 != 0) {
            Arrays.sort(kv2Var.f23537a, 0, i9);
        }
        short s = qd2Var.f28397a;
        nm0 nm0Var = h51.f20398c;
        fx4 fx4Var = new fx4();
        fx4Var.f19380a = kv2Var;
        fx4Var.f19381b = lv2Var2;
        fx4Var.f19382c = s;
        fx4Var.f19383d = nm0Var;
        fx4Var.f19384e = zw4.f36432a;
        float[] fArr = zw4.f36433b;
        fx4Var.f19385f = fArr;
        fx4Var.f19390k = fArr;
        fx4Var.f19391l = fArr;
        fx4Var.f19392m = zw4.f36434c;
        VarHandle.storeStoreFence();
        return fx4Var;
    }
}
