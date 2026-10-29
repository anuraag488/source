package p000;

import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ve4 implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final uo1 f32560a;

    public ve4(uo1 uo1Var) {
        this.f32560a = uo1Var;
    }

    /* JADX INFO: renamed from: a */
    public final gf4 m11887a(String str) {
        String upperCase;
        int iHashCode;
        String string = hd4.m6360z0(str).toString();
        int length = string.length();
        uo1 uo1Var = this.f32560a;
        if (length < 3 || ((iHashCode = (upperCase = string.substring(0, 3).toUpperCase(Locale.ROOT)).hashCode()) == 79487 ? !upperCase.equals("PRA") : iHashCode == 81978 ? !upperCase.equals("SEL") : !(iHashCode == 85954 && upperCase.equals("WIT")))) {
            ff4 ff4Var = new ff4(uo1Var, str);
            ff4Var.f18952d = uo1Var.m11591e(str);
            VarHandle.storeStoreFence();
            return ff4Var;
        }
        ef4 ef4Var = new ef4(uo1Var, str);
        ef4Var.f18052d = new int[0];
        ef4Var.f18053e = new long[0];
        ef4Var.f18054f = new double[0];
        ef4Var.f18055g = new String[0];
        ef4Var.f18056h = new byte[0][];
        return ef4Var;
    }

    /* JADX INFO: renamed from: b */
    public final /* bridge */ gf4 m11888b(String str) {
        return m11887a(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f32560a.close();
    }
}
