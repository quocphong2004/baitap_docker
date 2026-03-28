package com.phong.baitap_docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return """
        <!DOCTYPE html>
        <html lang="vi">
        <head>
            <meta charset="UTF-8">
            <title>CI/CD Docker</title>
            <style>
                body {
                    margin: 0;
                    height: 100vh;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
                    font-family: 'Segoe UI', sans-serif;
                    color: white;
                    overflow: hidden;
                }

                .card {
                    text-align: center;
                    padding: 40px;
                    border-radius: 20px;
                    background: rgba(255,255,255,0.1);
                    backdrop-filter: blur(10px);
                    box-shadow: 0 0 30px rgba(0,255,255,0.3);
                    animation: float 3s ease-in-out infinite;
                }

                h1 {
                    font-size: 32px;
                    margin-bottom: 20px;
                    text-shadow: 0 0 10px cyan;
                }

                p {
                    font-size: 18px;
                    opacity: 0.9;
                }

                @keyframes float {
                    0%,100% { transform: translateY(0); }
                    50% { transform: translateY(-15px); }
                }

                .glow {
                    color: #00ffff;
                    text-shadow: 0 0 5px #00ffff,
                                 0 0 10px #00ffff,
                                 0 0 20px #00ffff;
                }

                .bg-anim {
                    position: absolute;
                    width: 200%;
                    height: 200%;
                    background: radial-gradient(circle, rgba(0,255,255,0.2) 10%, transparent 10%);
                    background-size: 50px 50px;
                    animation: moveBg 10s linear infinite;
                    z-index: -1;
                }

                @keyframes moveBg {
                    from { transform: translate(0,0); }
                    to { transform: translate(-50px,-50px); }
                }
            </style>
        </head>
        <body>

            <div class="bg-anim"></div>

            <div class="card">
                <h1 class="glow">🚀 CI/CD Docker</h1>
                <p>Bài tập CI nâng cao</p>
                <p><strong>2280602340 - Bùi Quốc Phong</strong></p>
                <p>🔥 Deploy thành công trên DevOps</p>
            </div>

        </body>
        </html>
        """;
    }
}