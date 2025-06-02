{
  description = "Raytracer";

  inputs = { nixpkgs.url = "github:nixos/nixpkgs?ref=nixos-unstable"; };

  outputs = { self, nixpkgs }: {

    packages.x86_64-linux.hello = nixpkgs.legacyPackages.x86_64-linux.hello;

    packages.x86_64-linux.default = self.packages.x86_64-linux.hello;

    devShells.x86_64-linux.default =
      nixpkgs.legacyPackages.x86_64-linux.mkShell {
        buildInputs = [
          nixpkgs.legacyPackages.x86_64-linux.gradle
          nixpkgs.legacyPackages.x86_64-linux.zulu8
        ];
        shellHook = ''
          echo "Welcome to the Raytracer development shell!"
        '';
      };
  };
}
