package p000;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public enum kt5 {
    f23459b(0),
    f23461c(1),
    f23463d(2),
    f23465e(3),
    f23467f(56),
    f23469g(57),
    f23471h(58),
    f23473i(59),
    f23475j(60),
    f23477k(61),
    f23479l(62),
    f23481m(53),
    f23483n(4),
    f23484o(5),
    f23485p(52),
    f23486q(6),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(49),
    f23487r(7),
    f23488s(8),
    f23489t(9),
    f23490u(50),
    f23491v(10),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(11),
    f23492w(12),
    f23493x(13),
    f23494y(51),
    f23495z(47),
    f23432A(54),
    f23433B(55),
    f23434C(63),
    f23435D(64),
    f23436E(65),
    f23437F(66),
    f23438G(15),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(48),
    f23439H(16),
    f23440I(17),
    f23441J(18),
    f23442K(19),
    f23443L(20),
    f23444M(21),
    f23445N(22),
    f23446O(23),
    f23447P(24),
    f23448Q(25),
    f23449R(26),
    f23450S(27),
    f23451T(28),
    f23452U(29),
    f23453V(45),
    f23454W(30),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(31),
    f23455X(32),
    f23456Y(33),
    f23457Z(46),
    f23458a0(34),
    f23460b0(35),
    f23462c0(36),
    f23464d0(43),
    f23466e0(37),
    f23468f0(38),
    f23470g0(39),
    f23472h0(40),
    f23474i0(44),
    f23476j0(41),
    f23478k0(42);


    /* JADX INFO: renamed from: l0 */
    public static final HashMap f23480l0 = new HashMap();

    /* JADX INFO: renamed from: a */
    public final byte f23496a;

    static {
        for (kt5 kt5Var : values()) {
            f23480l0.put(Integer.valueOf(kt5Var.f23496a), kt5Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    kt5(int i) {
        this.f23496a = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.valueOf(this.f23496a).toString();
    }
}
