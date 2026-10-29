package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ir0 {

    /* JADX INFO: renamed from: a */
    public static final ir0 f21658a;

    /* JADX INFO: renamed from: b */
    public static final ir0 f21659b;

    /* JADX INFO: renamed from: c */
    public static final ir0 f21660c;

    /* JADX INFO: renamed from: d */
    public static final ir0 f21661d;

    /* JADX INFO: renamed from: e */
    public static final ir0 f21662e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ ir0[] f21663f;

    static {
        ir0 ir0Var = new ir0("CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_UNKNOWN", 0);
        f21658a = ir0Var;
        ir0 ir0Var2 = new ir0("CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_NOT_STARTED", 1);
        ir0 ir0Var3 = new ir0("CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_STARTED", 2);
        f21659b = ir0Var3;
        ir0 ir0Var4 = new ir0("CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_SUCCEEDED", 3);
        f21660c = ir0Var4;
        ir0 ir0Var5 = new ir0("CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_FAILED", 4);
        f21661d = ir0Var5;
        ir0 ir0Var6 = new ir0("CRONET_ADAPTIVE_TRAFFIC_REQUEST_STATE_CANCELLED", 5);
        f21662e = ir0Var6;
        f21663f = new ir0[]{ir0Var, ir0Var2, ir0Var3, ir0Var4, ir0Var5, ir0Var6};
    }

    public static ir0 valueOf(String str) {
        return (ir0) Enum.valueOf(ir0.class, str);
    }

    public static ir0[] values() {
        return (ir0[]) f21663f.clone();
    }
}
