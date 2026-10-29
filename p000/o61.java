package p000;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o61 implements ei3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f26367a;

    /* JADX INFO: renamed from: b */
    public byte[] f26368b;

    /* JADX INFO: renamed from: c */
    public byte[] f26369c;

    /* JADX INFO: renamed from: d */
    public Object f26370d;

    public /* synthetic */ o61(byte b) {
        this.f26367a = b;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m8966b(mh3 mh3Var) {
        j63 j63Var = mh3Var.f24921e;
        Integer num = mh3Var.f24922f;
        int iOrdinal = j63Var.ordinal();
        if (iOrdinal == 1) {
            return k63.m7411b(num.intValue()).m11250c();
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return k63.f22941a.m11250c();
            }
            if (iOrdinal != 4) {
                xy4.m12788q("unknown output prefix type");
                return null;
            }
        }
        return k63.m7410a(num.intValue()).m11250c();
    }

    @Override // p000.ei3
    /* JADX INFO: renamed from: a */
    public final void mo4729a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f26367a) {
            case 0:
                byte[] bArr3 = this.f26369c;
                byte[] bArr4 = this.f26368b;
                if (bArr4.length == 0 && bArr3.length == 0) {
                    m8967c(bArr, bArr2);
                } else if (!yv4.m13265b(bArr4, bArr)) {
                    xy4.m12788q("Invalid signature (output prefix mismatch)");
                } else {
                    if (bArr3.length != 0) {
                        bArr2 = zc6.m13537w(bArr2, bArr3);
                    }
                    m8967c(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
                }
                break;
            default:
                ei3 ei3Var = (ei3) this.f26370d;
                byte[] bArr5 = this.f26369c;
                byte[] bArr6 = this.f26368b;
                if (bArr6.length == 0 && bArr5.length == 0) {
                    ei3Var.mo4729a(bArr, bArr2);
                } else if (!yv4.m13265b(bArr6, bArr)) {
                    xy4.m12788q("Invalid signature (output prefix mismatch)");
                } else {
                    if (bArr5.length != 0) {
                        bArr2 = zc6.m13537w(bArr2, bArr5);
                    }
                    ei3Var.mo4729a(Arrays.copyOfRange(bArr, bArr6.length, bArr.length), bArr2);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m8967c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = bArr;
        if (bArr3.length != 64) {
            xy4.m12788q("The length of the signature is not 64.");
            return;
        }
        byte[] bArrM11250c = ((u50) this.f26370d).m11250c();
        if (bArr3.length == 64) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 32, 64);
            int i = 31;
            while (i >= 0) {
                int i2 = bArrCopyOfRange[i] & 255;
                int i3 = b61.f15104c[i] & 255;
                if (i2 != i3) {
                    if (i2 >= i3) {
                        break;
                    }
                    MessageDigest messageDigest = (MessageDigest) n81.f25516e.f25518a.mo3139g("SHA-512");
                    messageDigest.update(bArr3, 0, 32);
                    messageDigest.update(bArrM11250c);
                    messageDigest.update(bArr2);
                    byte[] bArrDigest = messageDigest.digest();
                    long jM3465f = b61.m3465f(0, bArrDigest) & 2097151;
                    long jM3466g = (b61.m3466g(2, bArrDigest) >> 5) & 2097151;
                    long jM3465f2 = (b61.m3465f(5, bArrDigest) >> 2) & 2097151;
                    long jM3466g2 = (b61.m3466g(7, bArrDigest) >> 7) & 2097151;
                    long jM3466g3 = (b61.m3466g(10, bArrDigest) >> 4) & 2097151;
                    long jM3465f3 = (b61.m3465f(13, bArrDigest) >> 1) & 2097151;
                    long jM3466g4 = (b61.m3466g(15, bArrDigest) >> 6) & 2097151;
                    long jM3465f4 = (b61.m3465f(18, bArrDigest) >> 3) & 2097151;
                    long jM3465f5 = b61.m3465f(21, bArrDigest) & 2097151;
                    long jM3466g5 = (b61.m3466g(23, bArrDigest) >> 5) & 2097151;
                    long jM3465f6 = (b61.m3465f(26, bArrDigest) >> 2) & 2097151;
                    long jM3466g6 = (b61.m3466g(28, bArrDigest) >> 7) & 2097151;
                    long jM3466g7 = (b61.m3466g(31, bArrDigest) >> 4) & 2097151;
                    long jM3465f7 = (b61.m3465f(34, bArrDigest) >> 1) & 2097151;
                    long jM3466g8 = (b61.m3466g(36, bArrDigest) >> 6) & 2097151;
                    long jM3465f8 = (b61.m3465f(39, bArrDigest) >> 3) & 2097151;
                    long jM3465f9 = b61.m3465f(42, bArrDigest) & 2097151;
                    long jM3466g9 = (b61.m3466g(44, bArrDigest) >> 5) & 2097151;
                    long jM3465f10 = (b61.m3465f(47, bArrDigest) >> 2) & 2097151;
                    long jM3466g10 = (b61.m3466g(49, bArrDigest) >> 7) & 2097151;
                    long jM3466g11 = (b61.m3466g(52, bArrDigest) >> 4) & 2097151;
                    long jM3465f11 = (b61.m3465f(55, bArrDigest) >> 1) & 2097151;
                    long jM3466g12 = (b61.m3466g(57, bArrDigest) >> 6) & 2097151;
                    long jM3466g13 = b61.m3466g(60, bArrDigest) >> 3;
                    long j = (jM3466g13 * 666643) + jM3466g6;
                    long j2 = (jM3466g13 * 470296) + jM3466g7;
                    long j3 = (jM3466g13 * 654183) + jM3465f7;
                    long j4 = jM3466g8 - (jM3466g13 * 997805);
                    long j5 = (jM3466g13 * 136657) + jM3465f8;
                    long j6 = jM3465f9 - (jM3466g13 * 683901);
                    long j7 = (jM3466g12 * 666643) + jM3465f6;
                    long j8 = (jM3466g12 * 470296) + j;
                    long j9 = (jM3466g12 * 654183) + j2;
                    long j10 = j3 - (jM3466g12 * 997805);
                    long j11 = (jM3466g12 * 136657) + j4;
                    long j12 = j5 - (jM3466g12 * 683901);
                    long j13 = (jM3465f11 * 666643) + jM3466g5;
                    long j14 = (jM3465f11 * 470296) + j7;
                    long j15 = (jM3465f11 * 654183) + j8;
                    long j16 = j9 - (jM3465f11 * 997805);
                    long j17 = (jM3465f11 * 136657) + j10;
                    long j18 = j11 - (jM3465f11 * 683901);
                    long j19 = (jM3466g11 * 666643) + jM3465f5;
                    long j20 = (jM3466g11 * 470296) + j13;
                    long j21 = (jM3466g11 * 654183) + j14;
                    long j22 = j15 - (jM3466g11 * 997805);
                    long j23 = (jM3466g11 * 136657) + j16;
                    long j24 = j17 - (jM3466g11 * 683901);
                    long j25 = (jM3466g10 * 666643) + jM3465f4;
                    long j26 = (jM3466g10 * 470296) + j19;
                    long j27 = (jM3466g10 * 654183) + j20;
                    long j28 = j21 - (jM3466g10 * 997805);
                    long j29 = (jM3466g10 * 136657) + j22;
                    long j30 = j23 - (jM3466g10 * 683901);
                    long j31 = (jM3465f10 * 666643) + jM3466g4;
                    long j32 = (jM3465f10 * 470296) + j25;
                    long j33 = (jM3465f10 * 654183) + j26;
                    long j34 = j27 - (jM3465f10 * 997805);
                    long j35 = (jM3465f10 * 136657) + j28;
                    long j36 = j29 - (jM3465f10 * 683901);
                    long j37 = (j31 + 1048576) >> 21;
                    long j38 = j32 + j37;
                    long j39 = j31 - (j37 << 21);
                    long j40 = (j33 + 1048576) >> 21;
                    long j41 = j34 + j40;
                    long j42 = j33 - (j40 << 21);
                    long j43 = (j35 + 1048576) >> 21;
                    long j44 = j36 + j43;
                    long j45 = j35 - (j43 << 21);
                    long j46 = (j30 + 1048576) >> 21;
                    long j47 = j24 + j46;
                    long j48 = j30 - (j46 << 21);
                    long j49 = (j18 + 1048576) >> 21;
                    long j50 = j12 + j49;
                    long j51 = j18 - (j49 << 21);
                    long j52 = (j6 + 1048576) >> 21;
                    long j53 = jM3466g9 + j52;
                    long j54 = j6 - (j52 << 21);
                    long j55 = (j38 + 1048576) >> 21;
                    long j56 = j42 + j55;
                    long j57 = j38 - (j55 << 21);
                    long j58 = (j41 + 1048576) >> 21;
                    long j59 = j45 + j58;
                    long j60 = j41 - (j58 << 21);
                    long j61 = (j44 + 1048576) >> 21;
                    long j62 = j48 + j61;
                    long j63 = j44 - (j61 << 21);
                    long j64 = (j47 + 1048576) >> 21;
                    long j65 = j51 + j64;
                    long j66 = j47 - (j64 << 21);
                    long j67 = (j50 + 1048576) >> 21;
                    long j68 = j54 + j67;
                    long j69 = j50 - (j67 << 21);
                    long j70 = (j53 * 666643) + jM3465f3;
                    long j71 = (j53 * 470296) + j39;
                    long j72 = (j53 * 654183) + j57;
                    long j73 = j56 - (j53 * 997805);
                    long j74 = (j53 * 136657) + j60;
                    long j75 = j59 - (j53 * 683901);
                    long j76 = (j68 * 666643) + jM3466g3;
                    long j77 = (j68 * 470296) + j70;
                    long j78 = (j68 * 654183) + j71;
                    long j79 = j72 - (j68 * 997805);
                    long j80 = (j68 * 136657) + j73;
                    long j81 = j74 - (j68 * 683901);
                    long j82 = (j69 * 666643) + jM3466g2;
                    long j83 = (j69 * 470296) + j76;
                    long j84 = (j69 * 654183) + j77;
                    long j85 = (j69 * 136657) + j79;
                    long j86 = j80 - (j69 * 683901);
                    long j87 = (j65 * 666643) + jM3465f2;
                    long j88 = (j65 * 470296) + j82;
                    long j89 = (j65 * 654183) + j83;
                    long j90 = (j65 * 136657) + (j78 - (j69 * 997805));
                    long j91 = (j66 * 666643) + jM3466g;
                    long j92 = (j66 * 470296) + j87;
                    long j93 = (j66 * 654183) + j88;
                    long j94 = j89 - (j66 * 997805);
                    long j95 = (j66 * 136657) + (j84 - (j65 * 997805));
                    long j96 = j90 - (j66 * 683901);
                    long j97 = (j62 * 666643) + jM3465f;
                    long j98 = (j62 * 470296) + j91;
                    long j99 = (j62 * 654183) + j92;
                    long j100 = j93 - (j62 * 997805);
                    long j101 = (j62 * 136657) + j94;
                    long j102 = j95 - (j62 * 683901);
                    long j103 = (j97 + 1048576) >> 21;
                    long j104 = j98 + j103;
                    long j105 = j97 - (j103 << 21);
                    long j106 = (j99 + 1048576) >> 21;
                    long j107 = j100 + j106;
                    long j108 = j99 - (j106 << 21);
                    long j109 = (j101 + 1048576) >> 21;
                    long j110 = j102 + j109;
                    long j111 = j101 - (j109 << 21);
                    long j112 = (j96 + 1048576) >> 21;
                    long j113 = (j85 - (j65 * 683901)) + j112;
                    long j114 = j96 - (j112 << 21);
                    long j115 = (j86 + 1048576) >> 21;
                    long j116 = j81 + j115;
                    long j117 = j86 - (j115 << 21);
                    long j118 = (j75 + 1048576) >> 21;
                    long j119 = j63 + j118;
                    long j120 = j75 - (j118 << 21);
                    long j121 = (j104 + 1048576) >> 21;
                    long j122 = j108 + j121;
                    long j123 = j104 - (j121 << 21);
                    long j124 = (j107 + 1048576) >> 21;
                    long j125 = j111 + j124;
                    long j126 = j107 - (j124 << 21);
                    long j127 = (j110 + 1048576) >> 21;
                    long j128 = j114 + j127;
                    long j129 = j110 - (j127 << 21);
                    long j130 = (j113 + 1048576) >> 21;
                    long j131 = j117 + j130;
                    long j132 = j113 - (j130 << 21);
                    long j133 = (j116 + 1048576) >> 21;
                    long j134 = j120 + j133;
                    long j135 = j116 - (j133 << 21);
                    long j136 = (j119 + 1048576) >> 21;
                    long j137 = (j136 * 666643) + j105;
                    long j138 = (j136 * 136657) + j125;
                    long j139 = j137 >> 21;
                    long j140 = (j136 * 470296) + j123 + j139;
                    long j141 = j137 - (j139 << 21);
                    long j142 = j140 >> 21;
                    long j143 = (j136 * 654183) + j122 + j142;
                    long j144 = j140 - (j142 << 21);
                    long j145 = j143 >> 21;
                    long j146 = (j126 - (j136 * 997805)) + j145;
                    long j147 = j143 - (j145 << 21);
                    long j148 = j146 >> 21;
                    long j149 = j138 + j148;
                    long j150 = j146 - (j148 << 21);
                    long j151 = j149 >> 21;
                    long j152 = (j129 - (j136 * 683901)) + j151;
                    long j153 = j149 - (j151 << 21);
                    long j154 = j152 >> 21;
                    long j155 = j128 + j154;
                    long j156 = j152 - (j154 << 21);
                    long j157 = j155 >> 21;
                    long j158 = j132 + j157;
                    long j159 = j155 - (j157 << 21);
                    long j160 = j158 >> 21;
                    long j161 = j131 + j160;
                    long j162 = j158 - (j160 << 21);
                    long j163 = j161 >> 21;
                    long j164 = j135 + j163;
                    long j165 = j161 - (j163 << 21);
                    long j166 = j164 >> 21;
                    long j167 = j134 + j166;
                    long j168 = j164 - (j166 << 21);
                    long j169 = j167 >> 21;
                    long j170 = (j119 - (j136 << 21)) + j169;
                    long j171 = j167 - (j169 << 21);
                    long j172 = j170 >> 21;
                    long j173 = j170 - (j172 << 21);
                    long j174 = (666643 * j172) + j141;
                    long j175 = (654183 * j172) + j147;
                    long j176 = j150 - (997805 * j172);
                    long j177 = (136657 * j172) + j153;
                    long j178 = j156 - (j172 * 683901);
                    long j179 = j174 >> 21;
                    long j180 = (470296 * j172) + j144 + j179;
                    long j181 = j174 - (j179 << 21);
                    long j182 = j180 >> 21;
                    long j183 = j175 + j182;
                    long j184 = j180 - (j182 << 21);
                    long j185 = j183 >> 21;
                    long j186 = j176 + j185;
                    long j187 = j183 - (j185 << 21);
                    long j188 = j186 >> 21;
                    long j189 = j177 + j188;
                    long j190 = j186 - (j188 << 21);
                    long j191 = j189 >> 21;
                    long j192 = j178 + j191;
                    long j193 = j189 - (j191 << 21);
                    long j194 = j192 >> 21;
                    long j195 = j159 + j194;
                    long j196 = j192 - (j194 << 21);
                    long j197 = j195 >> 21;
                    long j198 = j162 + j197;
                    long j199 = j195 - (j197 << 21);
                    long j200 = j198 >> 21;
                    long j201 = j165 + j200;
                    long j202 = j198 - (j200 << 21);
                    long j203 = j201 >> 21;
                    long j204 = j168 + j203;
                    long j205 = j201 - (j203 << 21);
                    long j206 = j204 >> 21;
                    long j207 = j171 + j206;
                    long j208 = j204 - (j206 << 21);
                    long j209 = j207 >> 21;
                    long j210 = j173 + j209;
                    long j211 = j207 - (j209 << 21);
                    bArrDigest[0] = (byte) j181;
                    bArrDigest[1] = (byte) (j181 >> 8);
                    bArrDigest[2] = (byte) ((j181 >> 16) | (j184 << 5));
                    bArrDigest[3] = (byte) (j184 >> 3);
                    bArrDigest[4] = (byte) (j184 >> 11);
                    bArrDigest[5] = (byte) ((j184 >> 19) | (j187 << 2));
                    bArrDigest[6] = (byte) (j187 >> 6);
                    bArrDigest[7] = (byte) ((j187 >> 14) | (j190 << 7));
                    bArrDigest[8] = (byte) (j190 >> 1);
                    bArrDigest[9] = (byte) (j190 >> 9);
                    bArrDigest[10] = (byte) ((j190 >> 17) | (j193 << 4));
                    bArrDigest[11] = (byte) (j193 >> 4);
                    bArrDigest[12] = (byte) (j193 >> 12);
                    bArrDigest[13] = (byte) ((j193 >> 20) | (j196 << 1));
                    bArrDigest[14] = (byte) (j196 >> 7);
                    bArrDigest[15] = (byte) ((j196 >> 15) | (j199 << 6));
                    bArrDigest[16] = (byte) (j199 >> 2);
                    bArrDigest[17] = (byte) (j199 >> 10);
                    bArrDigest[18] = (byte) ((j199 >> 18) | (j202 << 3));
                    bArrDigest[19] = (byte) (j202 >> 5);
                    bArrDigest[20] = (byte) (j202 >> 13);
                    bArrDigest[21] = (byte) j205;
                    bArrDigest[22] = (byte) (j205 >> 8);
                    bArrDigest[23] = (byte) ((j205 >> 16) | (j208 << 5));
                    bArrDigest[24] = (byte) (j208 >> 3);
                    bArrDigest[25] = (byte) (j208 >> 11);
                    bArrDigest[26] = (byte) ((j208 >> 19) | (j211 << 2));
                    bArrDigest[27] = (byte) (j211 >> 6);
                    bArrDigest[28] = (byte) ((j211 >> 14) | (j210 << 7));
                    bArrDigest[29] = (byte) (j210 >> 1);
                    bArrDigest[30] = (byte) (j210 >> 9);
                    bArrDigest[31] = (byte) (j210 >> 17);
                    long[] jArr = new long[10];
                    long[] jArrM7684O = kx5.m7684O(bArrM11250c);
                    long[] jArr2 = new long[10];
                    jArr2[0] = 1;
                    long[] jArr3 = new long[10];
                    long[] jArr4 = new long[10];
                    long[] jArr5 = new long[10];
                    long[] jArr6 = new long[10];
                    long[] jArr7 = new long[10];
                    kx5.m7725o0(jArr4, jArrM7684O);
                    kx5.m7697a0(jArr5, jArr4, c61.f15834a);
                    kx5.m7727p0(jArr4, jArr4, jArr2);
                    kx5.m7729q0(jArr5, jArr5, jArr2);
                    long[] jArr8 = new long[10];
                    kx5.m7725o0(jArr8, jArr5);
                    kx5.m7697a0(jArr8, jArr8, jArr5);
                    kx5.m7725o0(jArr, jArr8);
                    kx5.m7697a0(jArr, jArr, jArr5);
                    kx5.m7697a0(jArr, jArr, jArr4);
                    long[] jArr9 = new long[10];
                    long[] jArr10 = new long[10];
                    long[] jArr11 = new long[10];
                    kx5.m7725o0(jArr9, jArr);
                    kx5.m7725o0(jArr10, jArr9);
                    kx5.m7725o0(jArr10, jArr10);
                    kx5.m7697a0(jArr10, jArr, jArr10);
                    kx5.m7697a0(jArr9, jArr9, jArr10);
                    kx5.m7725o0(jArr9, jArr9);
                    kx5.m7697a0(jArr9, jArr10, jArr9);
                    kx5.m7725o0(jArr10, jArr9);
                    byte[] bArr4 = bArrM11250c;
                    for (int i4 = 1; i4 < 5; i4++) {
                        kx5.m7725o0(jArr10, jArr10);
                    }
                    kx5.m7697a0(jArr9, jArr10, jArr9);
                    kx5.m7725o0(jArr10, jArr9);
                    for (int i5 = 1; i5 < 10; i5++) {
                        kx5.m7725o0(jArr10, jArr10);
                    }
                    kx5.m7697a0(jArr10, jArr10, jArr9);
                    kx5.m7725o0(jArr11, jArr10);
                    for (int i6 = 1; i6 < 20; i6++) {
                        kx5.m7725o0(jArr11, jArr11);
                    }
                    kx5.m7697a0(jArr10, jArr11, jArr10);
                    kx5.m7725o0(jArr10, jArr10);
                    for (int i7 = 1; i7 < 10; i7++) {
                        kx5.m7725o0(jArr10, jArr10);
                    }
                    kx5.m7697a0(jArr9, jArr10, jArr9);
                    kx5.m7725o0(jArr10, jArr9);
                    for (int i8 = 1; i8 < 50; i8++) {
                        kx5.m7725o0(jArr10, jArr10);
                    }
                    kx5.m7697a0(jArr10, jArr10, jArr9);
                    kx5.m7725o0(jArr11, jArr10);
                    for (int i9 = 1; i9 < 100; i9++) {
                        kx5.m7725o0(jArr11, jArr11);
                    }
                    kx5.m7697a0(jArr10, jArr11, jArr10);
                    kx5.m7725o0(jArr10, jArr10);
                    for (int i10 = 1; i10 < 50; i10++) {
                        kx5.m7725o0(jArr10, jArr10);
                    }
                    kx5.m7697a0(jArr9, jArr10, jArr9);
                    kx5.m7725o0(jArr9, jArr9);
                    kx5.m7725o0(jArr9, jArr9);
                    kx5.m7697a0(jArr, jArr9, jArr);
                    kx5.m7697a0(jArr, jArr, jArr8);
                    kx5.m7697a0(jArr, jArr, jArr4);
                    kx5.m7725o0(jArr6, jArr);
                    kx5.m7697a0(jArr6, jArr6, jArr5);
                    kx5.m7727p0(jArr7, jArr6, jArr4);
                    if (b61.m3464e(jArr7)) {
                        kx5.m7729q0(jArr7, jArr6, jArr4);
                        if (b61.m3464e(jArr7)) {
                            xy4.m12788q("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                            return;
                        }
                        kx5.m7697a0(jArr, jArr, c61.f15836c);
                    }
                    if (!b61.m3464e(jArr) && ((bArr4[31] & 255) >> 7) != 0) {
                        xy4.m12788q("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                        return;
                    }
                    if ((kx5.m7679F(jArr)[0] & 1) == ((bArr4[31] & 255) >> 7)) {
                        for (int i11 = 0; i11 < 10; i11++) {
                            jArr[i11] = -jArr[i11];
                        }
                    }
                    kx5.m7697a0(jArr3, jArr, jArrM7684O);
                    jp0 jp0Var = new jp0(jArr, jArrM7684O, jArr2, (byte) 18);
                    byte b = 13;
                    a61[] a61VarArr = new a61[8];
                    a61VarArr[0] = new a61(new nh3(jp0Var, jArr3, b));
                    z32 z32Var = new z32(new jp0((byte) 18), new long[10], b);
                    b61.m3461b(jp0Var, z32Var);
                    nh3 nh3Var = new nh3(z32Var);
                    for (int i12 = 1; i12 < 8; i12++) {
                        b61.m3460a(z32Var, nh3Var, a61VarArr[i12 - 1]);
                        a61VarArr[i12] = new a61(new nh3(z32Var));
                    }
                    byte[] bArrM3469j = b61.m3469j(bArrDigest);
                    byte[] bArrM3469j2 = b61.m3469j(bArrCopyOfRange);
                    z32 z32Var2 = new z32();
                    nh3 nh3Var2 = new nh3((byte) 13);
                    int i13 = 255;
                    while (i13 >= 0 && bArrM3469j[i13] == 0 && bArrM3469j2[i13] == 0) {
                        i13--;
                    }
                    while (i13 >= 0) {
                        b61.m3461b(new jp0(z32Var2), z32Var2);
                        byte b2 = bArrM3469j[i13];
                        if (b2 > 0) {
                            nh3.m8731C(nh3Var2, z32Var2);
                            b61.m3460a(z32Var2, nh3Var2, a61VarArr[bArrM3469j[i13] / 2]);
                        } else if (b2 < 0) {
                            nh3.m8731C(nh3Var2, z32Var2);
                            b61.m3470k(z32Var2, nh3Var2, a61VarArr[(-bArrM3469j[i13]) / 2]);
                        }
                        byte b3 = bArrM3469j2[i13];
                        if (b3 > 0) {
                            nh3.m8731C(nh3Var2, z32Var2);
                            b61.m3460a(z32Var2, nh3Var2, c61.f15838e[bArrM3469j2[i13] / 2]);
                        } else if (b3 < 0) {
                            nh3.m8731C(nh3Var2, z32Var2);
                            b61.m3470k(z32Var2, nh3Var2, c61.f15838e[(-bArrM3469j2[i13]) / 2]);
                        }
                        i13--;
                    }
                    byte[] bArrM7232V = new jp0(z32Var2).m7232V();
                    for (int i14 = 0; i14 < 32; i14++) {
                        if (bArrM7232V[i14] != bArr[i14]) {
                            break;
                        }
                    }
                    return;
                }
                i--;
                bArr3 = bArr;
                bArrM11250c = bArrM11250c;
            }
        }
        xy4.m12788q("Signature check failed.");
    }
}
