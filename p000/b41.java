package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b41 extends ue2 implements wp1 {

    /* JADX INFO: renamed from: j */
    public static final b41 f15072j;

    /* JADX INFO: renamed from: k */
    public static final b41 f15073k;

    /* JADX INFO: renamed from: l */
    public static final b41 f15074l;

    /* JADX INFO: renamed from: m */
    public static final b41 f15075m;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f15076i;

    static {
        int i = 0;
        f15072j = new b41(i, (byte) 0);
        f15073k = new b41(i, (byte) 1);
        f15074l = new b41(i, (byte) 2);
        f15075m = new b41(i, (byte) 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b41(int i, byte b) {
        super(i);
        this.f15076i = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        switch (this.f15076i) {
            case 0:
                return new Handler(Looper.getMainLooper());
            case 1:
                return Boolean.TRUE;
            case 2:
                return ju4.f22634a;
            case 3:
                return Float.valueOf(0.0f);
            case 4:
                return new wf2(3);
            default:
                return new wf2(3);
        }
    }
}
