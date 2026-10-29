package p000;

import ads_mobile_sdk.C0313rh;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: be */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0488be {

    /* JADX INFO: renamed from: a */
    public static final float[] f15221a;

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float[] fArr = new float[C0313rh.f10756T0];
        f15221a = fArr;
        float[] fArr2 = new float[C0313rh.f10756T0];
        float f10 = 0.0f;
        int i = 0;
        float f11 = 0.0f;
        while (true) {
            float f12 = 1.0f;
            if (i >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f13 = i / 100.0f;
            float f14 = 1.0f;
            while (true) {
                f = ((f14 - f10) / 2.0f) + f10;
                f2 = f12 - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f15 = (((f * 0.35000002f) + (f2 * 0.175f)) * f3) + f4;
                f5 = f12;
                if (Math.abs(f15 - f13) < 1.0E-5d) {
                    break;
                }
                if (f15 > f13) {
                    f14 = f;
                } else {
                    f10 = f;
                }
                f12 = f5;
            }
            float f16 = 0.5f;
            fArr[i] = (((f2 * 0.5f) + f) * f3) + f4;
            float f17 = f5;
            while (true) {
                f6 = ((f17 - f11) / 2.0f) + f11;
                f7 = f5 - f6;
                f8 = f6 * 3.0f * f7;
                f9 = f6 * f6 * f6;
                float f18 = (((f7 * f16) + f6) * f8) + f9;
                float f19 = f17;
                if (Math.abs(f18 - f13) >= 1.0E-5d) {
                    if (f18 > f13) {
                        f17 = f6;
                    } else {
                        f11 = f6;
                        f17 = f19;
                    }
                    f16 = 0.5f;
                }
            }
            fArr2[i] = (((f6 * 0.35000002f) + (f7 * 0.175f)) * f8) + f9;
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0451ae m3552a(float f) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        float fM10674o = sc6.m10674o(f, 0.0f, 1.0f);
        int i = (int) (100.0f * fM10674o);
        if (i < 100) {
            float f4 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = f15221a;
            float f5 = fArr[i];
            float f6 = (fArr[i2] - f5) / ((i2 / 100.0f) - f4);
            float f7 = ((fM10674o - f4) * f6) + f5;
            f2 = f6;
            f3 = f7;
        }
        C0451ae c0451ae = new C0451ae();
        c0451ae.f14397a = f3;
        c0451ae.f14398b = f2;
        VarHandle.storeStoreFence();
        return c0451ae;
    }
}
