package p000;

import android.os.VibrationEffect;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class nv1 {

    /* JADX INFO: renamed from: a */
    public static final nc4 f26110a = new nc4(new fj0(19));

    /* JADX INFO: renamed from: a */
    public static VibrationEffect m8856a() {
        return VibrationEffect.createWaveform(new long[]{50}, new int[]{qq2.m10010E(127.5f)}, -1);
    }

    /* JADX INFO: renamed from: b */
    public static VibrationEffect m8857b() {
        return VibrationEffect.createWaveform(new long[]{20}, new int[]{qq2.m10010E(127.5f)}, -1);
    }

    /* JADX INFO: renamed from: c */
    public static final VibrationEffect m8858c(dv1 dv1Var) {
        List<ev1> list = dv1Var.f17423a;
        VibrationEffect vibrationEffect = dv1Var.f17424b;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return vibrationEffect;
        }
        try {
            VibrationEffect.Composition compositionStartComposition = VibrationEffect.startComposition();
            for (ev1 ev1Var : list) {
                compositionStartComposition.addPrimitive(ev1Var.f18511a, ev1Var.f18512b, ev1Var.f18513c);
            }
            return compositionStartComposition.compose();
        } catch (NoSuchMethodError unused) {
            return vibrationEffect;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final dv1 m8859d() {
        long[] jArr = {20, 20, 3, 43, 20, 20, 3};
        int[] iArr = {40, 80, 40, 0, 40, 80, 40};
        List listM7694Y = kx5.m7694Y(new ev1(1.0f, 3, 0), new ev1(1.0f, 3, 56), new ev1(1.0f, 3, 56));
        long[] jArrCopyOf = Arrays.copyOf(jArr, 8);
        jArrCopyOf[7] = 56;
        int length = jArrCopyOf.length;
        long[] jArrCopyOf2 = Arrays.copyOf(jArrCopyOf, length + 7);
        System.arraycopy(jArr, 0, jArrCopyOf2, length, 7);
        int length2 = jArrCopyOf2.length;
        long[] jArrCopyOf3 = Arrays.copyOf(jArrCopyOf2, length2 + 1);
        jArrCopyOf3[length2] = 56;
        int length3 = jArrCopyOf3.length;
        long[] jArrCopyOf4 = Arrays.copyOf(jArrCopyOf3, length3 + 7);
        System.arraycopy(jArr, 0, jArrCopyOf4, length3, 7);
        int[] iArrCopyOf = Arrays.copyOf(iArr, 8);
        iArrCopyOf[7] = 10;
        int length4 = iArrCopyOf.length;
        int[] iArrCopyOf2 = Arrays.copyOf(iArrCopyOf, length4 + 7);
        System.arraycopy(iArr, 0, iArrCopyOf2, length4, 7);
        int length5 = iArrCopyOf2.length;
        int[] iArrCopyOf3 = Arrays.copyOf(iArrCopyOf2, length5 + 1);
        iArrCopyOf3[length5] = 10;
        int length6 = iArrCopyOf3.length;
        int[] iArrCopyOf4 = Arrays.copyOf(iArrCopyOf3, length6 + 7);
        System.arraycopy(iArr, 0, iArrCopyOf4, length6, 7);
        return new dv1(listM7694Y, VibrationEffect.createWaveform(jArrCopyOf4, iArrCopyOf4, -1));
    }
}
